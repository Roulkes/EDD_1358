package com.urbenia.arreglos_adt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

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
    String[] Lineas;
    String[] Tempo;

    public Niomina(File Arch) {
        try {
            Path Ruta = Arch.toPath();
            BufferedReader lector = Files.newBufferedReader(Ruta);
            String Leido;

            while ((Leido = lector.readLine()) != null) {
                Lineas = Leido.split("\n");
                rozmiar += Lineas.length;
            }
            Arreglos_ADT Lista_plac = new Arreglos_ADT(rozmiar - 1); //Constructor del arreglo.
            for (int Indi = 0; Indi < rozmiar - 1; Indi++) {
                Tempo = Arrays.toString(Lineas).split(",");
                Empleado EmpTemp = new Empleado(int (Tempo.toString().charAt(0)),
                Tempo.toString().charAt(1), 
                Tempo.toString().charAt(2),
                Tempo.toString().charAt(3), 
                int (Tempo.toString().charAt(4)),
                int (Tempo.toString().charAt(5)),
                int (Tempo.toString().charAt(6)));
                Lista_plac.setElemento(Indi, EmpTemp);
            }
            System.out.print(Lista_plac);
            /*if (rozmiar > 0){
                System.out.println("Si está funcionando " + rozmiar);
            }*/
            //System.out.println("Akgi oafisaidfsa");

        } catch (IOException ex) {
        }

    }
}
