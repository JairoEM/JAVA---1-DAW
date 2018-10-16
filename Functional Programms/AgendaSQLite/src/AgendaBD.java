/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author losel
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AgendaBD {
    private Connection conexion;
    private Statement sentencia;
    private ResultSet resultado;
    
    public AgendaBD(){
        String url="C:\\Users\\losel\\Desktop\\Programación\\Programas Java\\NetBeans\\AgendaSQLite\\Agenda.s3db";
        try{
            conexion=DriverManager.getConnection("jdbc:sqlite:"+url);
        }catch (SQLException e){
            e.printStackTrace();
        }
        if (conexion!=null)
            System.out.println("Conexion realizada");
    }
    
    public ResultSet obtenerRegistros(String tabla){
        String sentenciaSQL="SELECT * FROM "+ tabla +" ORDER BY Nombre";
        System.out.println(sentenciaSQL);
        try {
            sentencia=conexion.createStatement();
            return resultado=sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("No se pudo realizar la consulta registros.");
            return null;
        }
    }
    
    public Contacto obtenerContacto (String valor){
        String sentenciaSQL="SELECT * FROM Contactos WHERE Nombre = '"+ valor +"'";
        System.out.println(sentenciaSQL);
        Contacto contactoAux;
        try {
            sentencia=conexion.createStatement();
            resultado=sentencia.executeQuery(sentenciaSQL);
            if(resultado.next()){
                String nom=resultado.getString("Nombre");
                String dir=resultado.getString("Direccion");
                String loc=resultado.getString("Localidad");
                String email=resultado.getString("Email");
                String tlf=resultado.getString("Telefono");
                int edad=resultado.getInt("Edad");
                contactoAux=new Contacto(nom, dir, loc, email, tlf, edad);
            }else{
                contactoAux=null;
            }
        } catch (SQLException e) {
            System.out.println("No se pudo realizar la consulta.");
            contactoAux=null;
        }
        return contactoAux;
    }
    
    public void insertarContacto(Contacto nuevoContacto){
        String nom=nuevoContacto.getNombre();
        String dir=nuevoContacto.getDireccion();
        String loc=nuevoContacto.getLocalidad();
        String email=nuevoContacto.getEmail();
        String tlf=nuevoContacto.getTelefono();
        int edad=nuevoContacto.getEdad();
        int resultado_update;
        String sentenciaSQL="INSERT INTO Contactos VALUES ('"+nom+"','"+dir+"','"+loc+"','"+tlf+"','"+email+"',"+edad+")";
        System.out.println(sentenciaSQL);
        try {
            sentencia=conexion.createStatement();
            resultado_update=sentencia.executeUpdate(sentenciaSQL);
        }catch(SQLException e){
            System.out.println("Error al añadir contacto.");
        }
    }
}

