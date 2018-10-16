
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
    
    
    public Controlador(){
        String url = ".\\Consumo.s3db";        
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:"+url);
            System.out.println("Conexion con la base de datos realizada con exito");
        } catch (SQLException e) {
            System.out.println("Fallo al establecer la conexion con la base de datos");
        }
    }
    
    public ResultSet obtenerRegistros(String tabla){
        String sentenciaSQL="SELECT * FROM "+tabla;
        try {
            sentencia=conexion.createStatement();
            return resultado=sentencia.executeQuery(sentenciaSQL);                       
        } catch (Exception e) {
            System.out.println("No se pudo realizar la consulta registros");
            return null;
        }
    }
    
    public ResultSet rellenarTabla(String fecha, String barra){
        String sentenciaSQL="SELECT Articulos.articulo, Consumo.unidades, Articulos.pvp "
                + "FROM Articulos, Consumo, Barras "
                + "WHERE Articulos.codigoArticulo = Consumo.codigoArticulo "
                + "AND Barras.codigoBarra = Consumo.codigoBarra "
                + "AND barra LIKE '"+barra+"' "
                + "AND fecha LIKE '"+fecha+"'";
        System.out.println(sentenciaSQL);
        
        try {
            sentencia=conexion.createStatement();
            return resultado=sentencia.executeQuery(sentenciaSQL);                       
        } catch (Exception e) {
            System.out.println("No se pudo realizar la consulta rellenar tabla");
            return null;
        }
    }
}
