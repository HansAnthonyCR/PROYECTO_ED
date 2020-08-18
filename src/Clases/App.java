/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Frames.JFrame_Login;
import Serializador.Serializador;

/**
 *
 * @author matos
 */
public class App {
    public static void main(String[] args) {
        try{
            Sistema.cliente.setClient(Serializador.Deserializar("cliente"));
            System.out.println("Archivos cargados correctamente\n");
        }catch(Exception e){
            System.out.println("No se encontraron archivos.");
        }
        JFrame_Login VP = new JFrame_Login();
        VP.setLocationRelativeTo(null);
        VP.setVisible(true);
        VP.show();
        System.out.println("Hola mundo");
    }
}
