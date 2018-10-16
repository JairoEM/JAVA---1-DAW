/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author losel
 */
public class Notas {
    private int idAlumno, idAsignatura, nota;
    private String evaluacion;

    public Notas(int idAlumno, int idAsignatura, String evaluacion, int nota) {
        this.idAlumno = idAlumno;
        this.idAsignatura = idAsignatura;
        this.evaluacion = evaluacion;
        this.nota = nota;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public int getNota() {
        return nota;
    }

    public String getEvaluacion() {
        return evaluacion;
    }
}
