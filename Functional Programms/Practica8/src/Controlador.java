
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author losel
 */
public class Controlador {
    private Connection conexion;
    private Statement sentencia;
    private ResultSet resultado;
    
    private Multa multa;
    private Coche automovil;
    private Infraccion infraccion;
    
    
    public Controlador(){
        String url = ".\\infracciones.s3db";        
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:"+url);
        } catch (SQLException e) {
            System.out.println("Fallo al establecer la conexion con la base de datos");
        }
        if (conexion != null) {
            System.out.println("Conexion con la base de datos realizada con exito");
        }
    }
    
    public ResultSet obtenerRegistros(String tabla){        
        String sentenciaSQL = "SELECT * FROM " + tabla + " ORDER BY nombre";
        try {
            sentencia = conexion.createStatement();
            return resultado = sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("No se pudo realizar la consulta Registros()");
            return null;
        }        
    }
    
    public Coche obtenerCoche(String valor){
        String sentenciaSQL = "SELECT * FROM Coches WHERE nombre = '"+ valor +"'";
        try {
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sentenciaSQL);
            automovil = null;
            if (resultado.next()) {
                String codigo = resultado.getString("codigo");
                String nif = resultado.getString("nif");
                String nombre = resultado.getString("nombre");
                String direccion = resultado.getString("direccion");
                String matricula = resultado.getString("matricula");
                String coche = resultado.getString("coche");
                
                automovil = new Coche(codigo,nif,nombre,direccion,matricula,coche);
            }else{
                System.out.println("No se pudo obtener el coche");
            }
        } catch (SQLException e) {
            System.out.println("No se pudo obtener los datos del coche y su conductor");
            return null;
        }
        return automovil;
    }
    
    public ResultSet rellenarInfracciones(String nom){
        String sentenciaSQL = "SELECT infracciones.infraccion, multas.fecha, infracciones.penalizacion "
                + "FROM coches, infracciones, multas "
                + "WHERE  infracciones.codigoInfraccion = multas.codigoInfraccion "
                + "AND coches.codigo = multas.codigoCoche "
                + "AND coches.nombre = '"+nom+"'";
        System.out.println(sentenciaSQL);
        try{
            sentencia=conexion.createStatement();
            resultado = sentencia.executeQuery(sentenciaSQL);
            return resultado;
        }catch(Exception e){
            System.out.println("Error al obtener las infracciones");
            return null;
        } 
    }
    
    public ResultSet obtenerTabla (String month, String year){
        String sentenciaSQL = "SELECT infracciones.infraccion, multas.fecha, coches.matricula, coches.nombre, infracciones.penalizacion "
                + "FROM coches, infracciones, multas "
                + "WHERE  infracciones.codigoInfraccion = multas.codigoInfraccion "
                + "AND coches.codigo = multas.codigoCoche "
                + "AND multas.fecha LIKE '%/"+month+"/"+year+"'";
        System.out.println(sentenciaSQL);
        try {
            sentencia=conexion.createStatement();
            resultado=sentencia.executeQuery(sentenciaSQL);
            return resultado;
        } catch (Exception e) {
            System.out.println("Error al obtener los datos definidos por mes y año");
            return null;
        }
    }
    
}
