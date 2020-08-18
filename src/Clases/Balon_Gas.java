/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

//CLASE BALON_GAS
public class Balon_Gas {
    private int stock;
    private  String tipo[]={"M2","M4","ML6","M6","M7","M9","M15","M22","24"};
    private int precio[]={80,100,150,200,250,300,400,500,550};
    private int capacidadLitros[]={42,113,165,164,198,255,425,640,280};
    private boolean estado;
    
    public void datosBalon(int po){
        if(disponible()){
            System.out.println("DATOS DEL BALON\n"
                    + "Tipo: "+tipo[po-1]+"\n"+
                    "Precio: "+precio[po-1]+"\n"+
                    "Capacidad: "+capacidadLitros[po-1]+"\n"+
                    "Stock: "+stock+"\n");
        }else{
            System.out.println("Balon del tipo "+tipo[po-1]+" AGOTADO");
        }
    }
    
    public boolean disponible(){
        if(estado){
            return true;
        }else{
            return false;
        }
    }
    
}