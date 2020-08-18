/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Repartidor extends Persona{
    //Atributos
    int codRepartidor;
    double sueldo;
    String direccionAsignada;
    //Constructor

    public Repartidor(int codRepartidor, double sueldo, String direccionAsignada, String DNI, String Nombres, String Apellidos, String Email) {
        super(DNI, Nombres, Apellidos, Email);
        this.codRepartidor = codRepartidor;
        this.sueldo = sueldo;
        this.direccionAsignada = direccionAsignada;
    }
    
}
