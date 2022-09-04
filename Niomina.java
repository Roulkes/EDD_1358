package com.urbenia.arreglos_adt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

/**
 *
 * @author yael_
 */
public class Niomina {

    public static void main(String[] args) throws FileNotFoundException {
        File Arch = new File("C:/Users/yael_/OneDrive/Escritorio/julio.dat"); //Sirve con "julio.dat" pero no con "junio.dat" POR??????
        Niomina Prueba = new Niomina(Arch);
        Prueba.Lista_Sueldos();
    }
    int rozmiar = 0;
    String LineasL = "";
    ArrayList<ArrayList<String>> OutterArray = new ArrayList();
    Arreglos_ADT Nomina;
    String[] Lineas;
    String[] TamLis;
    Empleado Emp;
    Empleado CEmp;

    public Niomina(File Arch) { //Constructor
        try {
            Path Ruta = Arch.toPath();
            BufferedReader lector = Files.newBufferedReader(Ruta);
            String Leido;

            while ((Leido = lector.readLine()) != null) {
                Lineas = Leido.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                TamLis = Leido.split("\n");
                rozmiar += TamLis.length;
                ArrayList<String> InnerArray = new ArrayList();
                for (String datos : Lineas) {
                    InnerArray.add(datos);
                }
                OutterArray.add(InnerArray);
            }

            //Esta parte es para asignar los valores al ADT Empleado
            Nomina = new Arreglos_ADT(rozmiar - 1);
            int Columnas = 0;
            for (int Filas = 1; Filas < OutterArray.size(); Filas++) {
                Emp = new Empleado(Integer.parseInt(OutterArray.get(Filas).get(0)), OutterArray.get(Filas).get(1), OutterArray.get(Filas).get(2), OutterArray.get(Filas).get(3), Integer.parseInt(OutterArray.get(Filas).get(4)), Integer.parseInt(OutterArray.get(Filas).get(5)), Integer.parseInt(OutterArray.get(Filas).get(6)));
                Nomina.setItem(Columnas, Emp);
                Columnas++;
            }
        } catch (IOException ex) {
        }

    }

    public void Lista_Sueldos() {
        for (int rozmiarS = 0; rozmiarS < Nomina.getLenght(); rozmiarS++) {
            Nomina.getItem(rozmiarS);
            System.out.println("Id: " + Emp.get_NumTrabajador() + ", Sueldo: " + Emp.CalcularSueldo());
        }
    }

    /*public Arreglos_ADT Mayor_Ant() {
        int Max = 2023;
        int Indice = 0;
        for (int ind = 0; ind < TamLis; ind++) {
            //CEmp = Nomina.getItem(ind);
            if (CEmp.get_AñoIngreso() < Max) {
                Indice = ind;
                Max = CEmp.get_AñoIngreso();
            }
        }
        //return Nomina.getItem(Indice);
    }*/
}
