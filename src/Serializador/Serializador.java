/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializador;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author matos
 */
public class Serializador {
    public static void Serializar ( String sNombreArchivo, Vector  arreglo) {
        try {
            ObjectOutputStream escritor = new  ObjectOutputStream (new FileOutputStream (sNombreArchivo));
            escritor.writeObject(arreglo);
            escritor.flush();
            System.out.println("Arhivo "+sNombreArchivo+ " guardado correctamete\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static Vector Deserializar (String sNombreArchivo) {
        Vector  v = new Vector ();
        try{
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(sNombreArchivo)); 
            v = (Vector)lector.readObject();
        } catch ( FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e){
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return v;    
    
    }
}
