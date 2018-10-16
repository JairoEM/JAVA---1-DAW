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
    private String nombre, direccion, telefono, email, localidad;
    private int edad;
    
    public Contacto(String nom, String dir, String tlf, String email, String loc, int edad){
        this.nombre=nom;
        this.direccion=dir;
        this.localidad=loc;
        this.telefono=tlf;
        this.email=email;
        this.edad=edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public String getLocalidad(){
        return localidad;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public String getEmail(){
        return email;
    }
    
    public int getEdad(){
        return edad;
    }
}
