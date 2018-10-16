
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
        String url=".\\alumnos.s3db";
        try {
            conexion=DriverManager.getConnection("jdbc:sqlite:"+url);
            System.out.println("Conexión con con la base de datos realizada con exito");
        } catch (SQLException e) {
            System.out.println("Conexión con la base de datos fallida");
        }
    }
    
    public ResultSet obtenerRegistros(String tabla){
        String sentenciaSQL="SELECT * FROM "+tabla;
        try {
            sentencia=conexion.createStatement();
            System.out.println("La consulta obtener registros se realizó con exito");
            return resultado=sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("No se pudo realizar la consulta obtener registros");
            return null;
        }
    }
    
    public ResultSet obtenerRegistrosGroup(String tabla, String grupo){
        String sentenciaSQL="SELECT * FROM "+tabla+" GROUP BY "+grupo;
        try {
            sentencia=conexion.createStatement();
            System.out.println(sentenciaSQL);
            System.out.println("La consulta obtener registros por grupo se realizó con exito");
            return resultado=sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("No se pudo realizar la consulta obtener registros por grupo");
            return null;
        }
    }
    
    public ResultSet obtenerRegistroAsignatura(String curso){
        String sentenciaSQL="SELECT asignatura "
                + "FROM asignaturas JOIN cursos "
                + "ON asignaturas.idCurso=cursos.idCurso "
                + "AND curso LIKE '"+curso+"' "
                + "GROUP BY asignatura";
        try {
            sentencia=conexion.createStatement();
            System.out.println(sentenciaSQL);
            System.out.println("La consulta obtener registros asignatura se realizó con exito");
            return resultado=sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("No se pudo realizar la consulta obtener registros asignatura");
            return null;
        }
    }
    
    public ResultSet obtenerAlumnosCandidatos(String curso){
        String sentenciaSQL="SELECT nombre "
                + "FROM alumnos JOIN cursos "
                + "ON alumnos.idCurso=cursos.idCurso "
                + "AND curso LIKE '"+curso+"'";
        try {
            sentencia=conexion.createStatement();
            System.out.println(sentenciaSQL);
            System.out.println("La consulta obtener alumnos candidatos se realizó con exito");
            return resultado=sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("No se pudo realizar la consulta obtener alumnos candidatos");
            return null;
        }
    }
    
    public ResultSet obtenerNota(String alumno, String curso, String evaluacion, String asignatura){
        String sentenciaSQL="SELECT notas.nota "
                + "FROM notas, alumnos, asignaturas, cursos "
                + "WHERE alumnos.idAlumno = notas.idAlumno "
                + "AND notas.idAsignatura = asignaturas.idAsignatura "
                + "AND cursos.idCurso = asignaturas.idCurso "
                + "AND alumnos.nombre LIKE '"+alumno+"' "
                + "AND cursos.curso LIKE '"+curso+"' "
                + "AND notas.evaluacion LIKE '"+evaluacion+"' "
                + "AND asignaturas.asignatura LIKE '"+asignatura+"'";
        try {
            sentencia=conexion.createStatement();
            System.out.println(sentenciaSQL);
            System.out.println("La consulta obtener notas se realizó con exito");
            return resultado=sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("No se pudo realizar la consulta obtener notas");
            return null;
        }
    }
    
    public void modificarNota (String alumno, String asignatura, String evaluacion, String nota){
        String sentenciaSQL="UPDATE notas SET nota = "+nota+" WHERE evaluacion LIKE '"+evaluacion+"' "
                + "AND idAlumno=(SELECT idAlumno FROM alumnos WHERE nombre LIKE '"+alumno+"') "
                + "AND idAsignatura=(SELECT idAsignatura FROM asignaturas WHERE asignatura LIKE '"+asignatura+"')";
        System.out.println(sentenciaSQL);
        try {
            sentencia=conexion.createStatement();
            System.out.println("La modificación de la nota se realizó con exito");
            int notaFinal=sentencia.executeUpdate(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("No se pudo modificar la nota");
        }
    }
}
