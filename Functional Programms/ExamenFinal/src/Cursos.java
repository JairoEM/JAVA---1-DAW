/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author losel
 */
public class Cursos {
    private int idCurso;
    private String curso;

    public Cursos(int idCurso, String curso) {
        this.idCurso = idCurso;
        this.curso = curso;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public String getCurso() {
        return curso;
    }
}
