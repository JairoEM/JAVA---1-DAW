/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    import java.sql.*;
/**
 *
 * @author losel
 */
public class AgendaBD {
    private Connection conexion;
    private Statement sentencia;
    private ResultSet resultado;    
    private Contacto contacto;
    
    
    public AgendaBD(){
        String url = ".\\Agenda2.s3db";        
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:"+url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (conexion != null) {
            System.out.println("Conexion realizada con exito");
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
    
    public Contacto obtenerContacto(String valor){
        String sentenciaSQL = "SELECT * FROM agenda WHERE nombre = '"+ valor +"'";
        System.out.println(sentenciaSQL);
        try {
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sentenciaSQL);
            contacto = null;
            if (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String direccion = resultado.getString("direccion");
                String localidad = resultado.getString("localidad");
                String telefono = resultado.getString("telefono");
                String correo = resultado.getString("correo");
                int edad = resultado.getInt("edad");
                
                contacto = new Contacto(nombre, direccion, localidad, telefono, correo, edad);
            }
        } catch (SQLException e) {
            System.out.println("No se pudo obtener el contacto");
            return null;
        }
        return contacto;
    }
    
     public void insertarContacto(Contacto contacto){
        String nombre = contacto.getNombre();
        String direccion = contacto.getDireccion();
        String localidad = contacto.getLocalidad();
        String telefono = contacto.getTelefono();
        String correo = contacto.getCorreo();
        int edad = contacto.getEdad();
        int resultado_update;
        
        String sentenciaSQL = "INSERT INTO agenda VALUES('"+ nombre +"','"+ direccion +"','"+ localidad +"','"+ telefono +"','"+ correo +"'," + edad + ")";
        System.out.println(sentenciaSQL);
        
        try {
            sentencia = conexion.createStatement();
            resultado_update = sentencia.executeUpdate(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("Fallo de inserccion");
        }
    }
    
    public void modificarContacto(Contacto contacto, String nombreAuxiliar){
        String nombre = contacto.getNombre();
        String direccion = contacto.getDireccion();
        String localidad = contacto.getLocalidad();
        String telefono = contacto.getTelefono();
        String correo = contacto.getCorreo();
        int edad = contacto.getEdad();
        int resultado_update;
        
        String sentenciaSQL = "UPDATE agenda SET nombre='"+ nombre +"', direccion='"+ direccion +"', localidad='"+ localidad +"', "
                + "telefono='"+ telefono +"', correo='"+ correo +"', edad="+ edad +" WHERE nombre='"+ nombreAuxiliar +"'";
        System.out.println(sentenciaSQL);
        
        try {
            sentencia = conexion.createStatement();
            resultado_update = sentencia.executeUpdate(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("Fallo de insercion");
        }
    }
    
    public void borrarContacto(Contacto contacto){
        String nombre = contacto.getNombre();
        String direccion = contacto.getDireccion();
        String localidad = contacto.getLocalidad();
        String telefono = contacto.getTelefono();
        String correo = contacto.getCorreo();
        int edad = contacto.getEdad();
        int resultado_update;
        
        String sentenciaSQL = "DELETE FROM Agenda WHERE nombre='"+ nombre +"' and direccion='"+ direccion +"' and localidad='"+ localidad +"' and telefono='"+ telefono +"' and correo='"+ correo +"' and edad="+ edad;
        System.out.println(sentenciaSQL);
        
        try {
            sentencia = conexion.createStatement();
            resultado_update = sentencia.executeUpdate(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("Fallo de eliminación");
        }
    }
    
}
