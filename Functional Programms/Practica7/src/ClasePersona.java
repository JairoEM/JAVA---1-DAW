
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author losel
 */
public class ClasePersona {
    private String nombre, direccion, edad, telefono;
    public ClasePersona (String nombre, String direccion, String edad, String telefono){
        this.nombre=nombre;
        this.direccion=direccion;
        this.edad=edad;
        this.telefono=telefono;        
    }
    public ClasePersona(){
        nombre="";
        direccion="";
        edad="";
        telefono="";
    }
    public void setNombre(String nombreN){
        nombre=nombreN;
    }
    public void setDireccion(String direccionN){
        direccion=direccionN;
    }
    public void setEdad(String edadN){
        edad=edadN;
    }
    public void setTelefono(String telefonoN){
        telefono=telefonoN;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getEdad(){
        return edad;
    }
    public String getTelefono(){
        return telefono;
    }
}