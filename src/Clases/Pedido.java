/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Pedido {
    private int numPedido;
    private FECHA fechaPedido;
    private int total;
    private HORA hora;

    public Pedido(int numPedido, FECHA fechaPedido, int total, HORA hora) {
        this.numPedido = numPedido;
        this.fechaPedido = fechaPedido;
        this.total = total;
        this.hora = hora;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public FECHA getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(FECHA fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public HORA getHora() {      
     return hora;
    }

    public void setHora(HORA hora) {
        this.hora = hora;
    }
    public void mostrar(){
        System.out.println("Número de pedido: "+numPedido);
        System.out.println("Fecha de pedido: "+fechaPedido.toString());
        System.out.println("Total: "+total);
        System.out.println("Hora de pedido: "+hora.toString());
    }
}
