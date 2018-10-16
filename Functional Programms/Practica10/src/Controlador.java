
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
        String url=".\\baloncesto.s3db";
        try {
            conexion=DriverManager.getConnection("jdbc:sqlite:"+url);
            System.out.println("Conexión con con la base de datos realizada con exito");
        } catch (Exception e) {
            System.out.println("Conexión con la base de datos fallida");
        }
    }
    
    public ResultSet obtenerRegistros(String tabla){
        String sentenciaSQL="SELECT * FROM "+tabla;
        try {
            sentencia=conexion.createStatement();
            System.out.println("La consulta obtener registros se realizó con exito");
            return resultado=sentencia.executeQuery(sentenciaSQL);
        } catch (Exception e) {
            System.out.println("No se pudo realizar la consulta obtener registros");
            return null;
        }
    }
    
    public ResultSet obtenerRegistrosGroup(String tabla, String like, String grupo){
        String sentenciaSQL="SELECT * FROM "+tabla+" WHERE jornada LIKE '"+like+"' GROUP BY "+grupo;
        try {
            sentencia=conexion.createStatement();
            System.out.println(sentenciaSQL);
            System.out.println("La consulta obtener registros se realizó con exito");
            return resultado=sentencia.executeQuery(sentenciaSQL);
        } catch (Exception e) {
            System.out.println("No se pudo realizar la consulta obtener registros");
            return null;
        }
    }
    
    public ResultSet obtenerEquipoLocal(String jornada, String partido){
        String sentenciaSQL="SELECT nombre, fecha " +
            "FROM Equipos JOIN Puntuaciones JOIN Partidos JOIN Jornadas " +
            "ON Equipos.codigoEquipo=Puntuaciones.codigoEquipo " +
            "AND Puntuaciones.codigoJornada=Partidos.jornada " +
            "AND Jornadas.jornada=Partidos.jornada " +
            "WHERE Equipos.codigoEquipo LIKE codigoEquipo1 " +
            "AND Partidos.jornada LIKE '" +jornada+"' " +
            "AND Partidos.codigoPartido LIKE '"+partido+"'";
        try {
            sentencia=conexion.createStatement();
            System.out.println(sentenciaSQL);
            return resultado=sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("No se pudo realizar la consulta obtener equipo local");
            return null;
        }
    }
    
    public ResultSet obtenerEquipoVisitante(String jornada, String partido){
        String sentenciaSQL="SELECT nombre, fecha " +
            "FROM Equipos JOIN Puntuaciones JOIN Partidos JOIN Jornadas " +
            "ON Equipos.codigoEquipo=Puntuaciones.codigoEquipo " +
            "AND Puntuaciones.codigoJornada=Partidos.jornada " +
            "AND Jornadas.jornada=Partidos.jornada " +
            "WHERE Equipos.codigoEquipo LIKE codigoEquipo2 " +
            "AND Partidos.jornada LIKE '"+jornada+"' " +
            "AND Partidos.codigoPartido LIKE '"+partido+"'";
        try {
            sentencia=conexion.createStatement();
            System.out.println("La consulta obtener equipo visitante se realizó con exito");
            return resultado=sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("No se pudo realizar la consulta obtener equipo visitante");
            return null;
        }
    }
    
    public ResultSet obtenerCanastas(String jornada, String partido, String equipo){
        String sentenciaSQL="SELECT * "
                + "FROM Puntuaciones,Equipos "
                + "WHERE Puntuaciones.codigoEquipo=Equipos.codigoEquipo "
                + "AND codigoJornada LIKE '"+jornada+"' "
                + "AND codigoPartido LIKE '"+partido+"' "
                + "AND nombre LIKE '"+equipo+"'";
        System.out.println(sentenciaSQL);
        try {
            sentencia=conexion.createStatement();
            System.out.println("La consulta obtener canastas se realizó con exito");
            return resultado=sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("No se pudo realizar la consulta obtener canastas    ");
            return null;
        }
    }
    
}
