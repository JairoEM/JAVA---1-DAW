/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author losel
 */
public class Alumnos {
    private int idAlumno, idCurso;
    private String nombre;

    public Alumnos(int idAlumno, String nombre, int idCurso) {
        this.idAlumno = idAlumno;     
        this.nombre = nombre;
        this.idCurso = idCurso;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public String getNombre() {
        return nombre;
    }
}
