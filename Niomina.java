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
    int rozmiar = 0;
    int TamLis;
    String LineasL = "";
    String Cortadora1 = "";
    String[] Final;
    String[] Lineas;
    String[] Tempo;
    Empleado Ya;

    public Niomina(File Arch) {
        try {
            Path Ruta = Arch.toPath();
            BufferedReader lector = Files.newBufferedReader(Ruta);
            String Leido;

            while ((Leido = lector.readLine()) != null) {
                Lineas = Leido.split("\n");
                rozmiar += Lineas.length;
                LineasL += Arrays.toString(Lineas);
                //System.out.println(Lineas[0]);
            }
            
            for (int Corr = 0; Corr < rozmiar; Corr++){
                Final = LineasL.split(",");
                Cortadora1 += Arrays.toString(Final);
            }
            System.out.println(Cortadora1);
            
            Arreglos_ADT Infierno = new Arreglos_ADT(rozmiar);
            for (int Cor = 0; Cor < rozmiar; Cor++) {
                Infierno.setItem(Cor, LineasL);
                //System.out.println(Infierno.getItem(Cor));
            }


            //Esta parte es para asignar los valores al ADT Empleado
            /*Arreglos_ADT Lista_plac = new Arreglos_ADT(rozmiar - 1); //Constructor del arreglo.
            for (int Indi = 0; Indi < rozmiar - 1; Indi++) {
                Tempo = Arrays.toString(Lineas).split(",");
                String Cadena = Arrays.toString(Tempo);
                /*Empleado Ya = new Empleado(int (Cadena.charAt(0)
                ), Cadena.charAt(1)
                , Cadena.charAt(2)
                , Cadena.charAt(3), int (Cadena.charAt(4)), int (Cadena.charAt(5)), int (Cadena.charAt(6)
                ));
                Lista_plac.setItem(Ya, Indi);
            }
            TamLis = Lista_plac.getLenght();
            Empleado No = new Empleado(5, "Cosa", "Casa", "Mort", 1, 23000, 1666);
            System.out.print(No.to_String());*/
        } catch (IOException ex) {
        }

    }

    /*public String Lista_Sueldos() {
        for (int rozmiarS = 0; rozmiarS < TamLis; rozmiarS++) {
            Emp = Ya.getItem(rozmiarS);
            System.out.println("Id: " + Emp.get_NumTrabajador() + ", Sueldo: " + Emp.CalcularSueldo);
        }
    }*/

 /*public String Mayor_Ant() {
        int Max = 2023;
        int Indice = 0;
        for (int ind = 0; ind < TamLis; ind++) {
            Emp = Ya.getItem(ind);
            if (Emp.get_AñoIngreso() < Max) {
                Indice = ind;
                Max = Emp.get_AñoIngreso();
            }
        }
        return Ya.getItem(ind);
    }*/
}
