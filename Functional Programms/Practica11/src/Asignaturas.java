/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author losel
 */
public class Asignaturas {
    private int idAsignatura, idCurso;
    private String asignatura;

    public Asignaturas(int idAsignatura, String asignatura, int idCurso) {
        this.idAsignatura = idAsignatura;
        this.asignatura = asignatura;
        this.idCurso = idCurso;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}
