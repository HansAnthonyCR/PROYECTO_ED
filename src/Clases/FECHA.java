/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


class FECHA {
    private int dia;
    private int mes;
    private int anio;

    public FECHA(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return dia +"/"+mes+"/"+anio;
    }
}
