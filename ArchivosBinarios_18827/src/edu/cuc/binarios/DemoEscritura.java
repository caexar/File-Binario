/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuc.binarios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adelahoz6
 */
public class DemoEscritura {
    public static void main(String[] args) {
        File archivo = new File("archivosalida.txt");
        String cadena1 = "Netbeans";
        String cadena2 = "Esta es una linea de prueba para el archivo.";
        try {
            System.out.println("Inicializando archivo...");
            FileOutputStream salida = new FileOutputStream(archivo);
            //Un Caracter
//            salida.write('X');
//            salida.close();
            //Cadena Completa
//            char[] vectorCaracteres = cadena2.toCharArray();
//            for (int i = 0; i < vectorCaracteres.length; i++) {
//                char caracterActual = vectorCaracteres[i];
//                salida.write(caracterActual);
//                salida.write('\n');
//            }            
//            salida.write('\n');
//            salida.write('F');
//            salida.close();
            //Por cadenas completas (lineas)
            byte[] bytes1 = cadena1.getBytes();
            byte[] bytes2 = cadena2.getBytes();
            salida.write(bytes1);
            salida.write('\n');
            salida.write(bytes2);
            salida.close();
            System.out.println("Escritura terminada!");
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(DemoEscritura.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(DemoEscritura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
