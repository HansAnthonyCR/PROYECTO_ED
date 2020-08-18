/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vectores;

import Clases.Cliente;
import java.util.ArrayList;
import java.util.Vector;

public class VectorCliiente {
       //Atributos
    
   // public ArrayList<Cliente> Client = new ArrayList<Cliente>();
    private Vector<Cliente> Client = new Vector<Cliente>();
    //Constructor

    public VectorCliiente() {
        this.Client = new Vector<>();
    }

   
    //Getters & Setters

    public Vector<Cliente> getClient() {
        return Client;
    }

    public void setClient(Vector<Cliente> Client) {
        this.Client = Client;
    }

    
    //Métodos
      
    
    public void Agregar(Cliente c){
        this.Client.add(c);
    }
    
    public Vector Mostrar(){
        return this.Client;
    }
    
    public boolean buscarCliente(String NombreUsuario){//Búsqueda secuencial
        for(Cliente cli:this.Client){
            if(cli.getUsuario().equalsIgnoreCase(NombreUsuario)){
                return true;
            }
        }
        return false;
    }
    
    public Cliente validar(String DNI, String usuario){
        for(Cliente obj: this.Client){
            if(obj.validar(usuario,DNI)){
                return obj;
            }
        }
        return null;
    }
    public Cliente sesion(String contrasenia, String usuario){
        for(Cliente obj: this.Client){
            if(obj.sesion(contrasenia,usuario)){
                return obj;
            }
        }
        return null;
    }
    
    public boolean ingresar(Cliente cli){
        if(!buscarCliente(cli.getUsuario())){
            validar(cli.getDNI(),cli.getUsuario());
            Agregar(cli);
            return true;
        }
        return false;
    }
    
    public String[] get_Título_Cliente(){
        String result[] = new String[8];
        result[0] = "Usuario";
        result[1] = "Contraseña";
        result[2] = "Direccion";
        result[3] = "Telefono";
        result[4] = "DNI";
        result[5] = "Nombres";
        result[6] = "Apellidos";
        result[7] = "Email";
        return result;
    } 
    
    public String[][] getCliente(){
        String [][] result = new String[this.Client.size()][8];
        int i=0;
        for(Cliente cli : this.Client){
            if(cli != null){
                result[i][0] = cli.getUsuario();
                result[i][1] = cli.getContrasenia();
                result[i][2] = cli.getDireccion();
                result[i][3] = cli.getTelefono();
                result[i][4] = cli.getDNI();
                result[i][5] = cli.getNombres();
                result[i][6] = cli.getApellidos();
                result[i][7] = cli.getEmail();
                i++;
            }
        }
        return result;
    }
    /*
    @Override
    public String toString(){
        String result = "";
        for(Docente n: this.Client){
            result = result + n + "\n";
        }
        return result;
    }
    
    public String[][] getDocente(){
        String [][] result = new String[this.Client.size()][4];
        int i=0;
        for(Cliente doc : this.Client){
            if(doc != null){
                result[i][0] = doc.getNombre();
                result[i][1] = doc.getApellido();
                result[i][2] = doc.getDNI();
                result[i][3] = doc.getCodigoProfesor();
                i++;
            }
        }
        return result;
    }
    
    public String[] get_Título_Docente(){
        String result[] = new String[4];
        result[0] = "Nombre";
        result[1] = "Apellido";
        result[2] = "DNI";
        result[3] = "Código Docente";
        return result;
    }*/
}
