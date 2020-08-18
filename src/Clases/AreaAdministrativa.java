/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

// CLASE AREA ADMINISTRATIVA
public class AreaAdministrativa {
    
    int nroPersonal;
    int cantBoletas;
    ListaBoleta Boletas;
    
    
    public AreaAdministrativa() {
        this.nroPersonal = 0;
        this.cantBoletas = 0;
        this.Boletas = new ListaBoleta();
    }
    
    public void GenerarBoleta(Cliente C){
        Boletas.AñadirBoleta(C);
        cantBoletas++;
    }
    
}
