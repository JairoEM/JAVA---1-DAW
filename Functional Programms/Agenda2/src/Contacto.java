/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author losel
 */
public class Contacto {
    private String nombre,direccion,localidad,telefono,correo;
    private int edad;
    
    public Contacto(String nom, String dir,String loc,String tlf,String correo, int edad){
        nombre = nom;
        direccion = dir;
        localidad = loc;
        telefono = tlf;
        this.correo = correo;
        this.edad = edad;       
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public int getEdad() {
        return edad;
    }

}
