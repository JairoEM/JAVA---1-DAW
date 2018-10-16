/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author losel
 */
public class Equipos {
    private int id;
    private String codigoEquipo, nombre;

    public Equipos(int id, String codigoEquipo, String nombre) {
        this.id = id;
        this.codigoEquipo = codigoEquipo;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getCodigoEquipo() {
        return codigoEquipo;
    }

    public String getNombre() {
        return nombre;
    }
    
}
