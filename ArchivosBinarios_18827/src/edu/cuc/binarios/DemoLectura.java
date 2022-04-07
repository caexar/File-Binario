/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuc.binarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adelahoz6
 */
public class DemoLectura {

    public static void main(String[] args) {
        File archivo = new File("archivosalida.txt");
        try {
            FileInputStream entrada = new FileInputStream(archivo);
            System.out.println("Inicializando archivo...");
            String cadena = "";
            
            int primerbyte = entrada.read();
            char primeraLetra = (char) primerbyte;
            System.out.println("***************"+primeraLetra);
            int contador=0;
            while (entrada.available() != 0) {                
                int byteLeido = entrada.read();
                char caracterLeido = (char) byteLeido;
               System.out.println("Valor Leido: " + byteLeido + " : " + caracterLeido);
               
                //if (caracterLeido == ' ' || caracterLeido == '\n') {
                if (caracterLeido == '\n') {
                    contador++;
                    System.out.println("Cadena Leida: "+cadena);
                    cadena = "";
                } else {
                    cadena += caracterLeido;
                }
            }
            System.out.println("Cadena Leida: "+cadena);
            System.out.println("Finalizado!");
            System.out.println("numero de lineas: "+contador);
            entrada.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DemoLectura.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DemoLectura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
