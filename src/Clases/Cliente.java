/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;

public class Cliente extends Persona implements Serializable{
    //Atributos
    String Usuario;
    String Contrasenia;
    String Direccion;
    String Telefono;
    //Constructor

    public Cliente(String Usuario, String Contrasenia, String Direccion, 
            String Telefono, String DNI, String Nombres, String Apellidos, 
            String Email) {
        super(DNI, Nombres, Apellidos, Email);
        this.Usuario = Usuario;
        this.Contrasenia = Contrasenia;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }
    
    //Getter&Setter

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    //Métodos
    
    public boolean validar(String usuario,String DNI){
        if(this.Usuario.equalsIgnoreCase(usuario)&&this.DNI.equals(DNI)){
            return true;
        }
        return false;
    }
    
    public boolean sesion(String contrasenia,String usuario){
        if(this.Usuario.equalsIgnoreCase(usuario)&&this.Contrasenia.equals(contrasenia)){
            return true;
        }
        return false;
    }
}