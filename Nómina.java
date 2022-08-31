package com.urbenia.arreglos_adt;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author yael_
 */
public class Nómina {

    public static void main(String[] args) {
        File Archivo = new File("C:\\Users\\yael_\\OneDrive\\Escritorio");
        Nómina Prueba = new Nómina(Archivo);
    }

    public Nómina(File Archivo) {
        Path Lectura = Archivo.toPath();
        try {
            BufferedReader Leer = Files.newBufferedReader(Lectura);
            String Leido;
            while ((Leido = Leer.readLine()) != null) {
                //Leerá linea a linea hasta que no haya más que leer.
                //Guarda todo dividido por comas.
                String [] Ln = Leido.split("\n");
                System.out.println(Ln + "");
            }

        } catch (IOException e) {
        }
        /*
        self.archivo = ruta //Obtiene un archivo de esa ruta
        entrada = open(self.archivo, 'rt') //Abre el archivo y lo guarda en otra variable
        info = entrada.read // Lee el archivo y lo guarda en otra variable
        lineas = info.split(\n) //Divide las lineas por salto de linea y lo guarda en otra variable
        print lineas //Imprime lo que hizo
         */
    }

    String Nombre_Empresa;
    Arreglos_ADT<Object> Lista_Emp;
}
