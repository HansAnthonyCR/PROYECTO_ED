/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Venta {
    private int numVenta;
    private FECHA fechaVenta;

    public Venta(int numVenta, FECHA fechaVenta) {
        this.numVenta = numVenta;
        this.fechaVenta = fechaVenta;
    }

    public int getNumVenta() {
        return numVenta;
    }

    public void setNumVenta(int numVenta) {
        this.numVenta = numVenta;
    }

    public FECHA getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(FECHA fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    
    public void mostrarVenta(){
        System.out.println("Número de venta: "+numVenta);
        System.out.println("Fecha de venta: "+fechaVenta.toString());
    }
}
