package com.urbenia.arreglos_adt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author yael_
 */
public class Niomina {

    public static void main(String[] args) throws FileNotFoundException {
        File Arch = new File("C:/Users/yael_/OneDrive/Escritorio/julio.dat"); //Sirve con "julio.dat" pero no con "junio.dat"??????
        Niomina Prueba = new Niomina(Arch);
    }
    String LineasL = "";
    String Cortadora1 = "";
    int rozmiar = 0;
    

    public Niomina(File Arch) {
        try {
            Path Ruta = Arch.toPath();
            BufferedReader lector = Files.newBufferedReader(Ruta);
            String Leido;


            while ((Leido = lector.readLine()) != null) {
                String[] Temp = Leido.split("\n");
                rozmiar += Temp.length;
            }
            if (rozmiar > 0){
                System.out.println("Si está funcionando " + rozmiar);
            }
            System.out.println("Akgi oafisaidfsa");
            Arreglos_ADT Lista_plac = new Arreglos_ADT(rozmiar);

        } catch (IOException ex) {
        }


    }
}
