package com.urbenia.arreglos_adt;

/**
 *
 * @author yael_
 */
public class Empleado {

    private int NumTrabajador;
    private String Nombres;
    private String Ap_Paterno;
    private String Ap_Materno;
    private int Horas_Ex;
    private int Sueldo_B;
    private int Año_Ing;
    private int Ant;
    private double Tolat;

    public Empleado(int NumTrabajador, String Nombres, String Ap_Paterno, String Ap_Materno, int Horas_Ex, int Sueldo_B, int Año_Ing) {
        this.NumTrabajador = NumTrabajador;
        this.Nombres = Nombres;
        this.Ap_Paterno = Ap_Paterno;
        this.Ap_Materno = Ap_Materno;
        this.Horas_Ex = Horas_Ex;
        this.Sueldo_B = Sueldo_B;
        this.Año_Ing = Año_Ing;
    }

    public int get_NumTrabajador() {
        return this.NumTrabajador;
    }

    public void set_NumTrabajador(int NumTrabajador) {
        this.NumTrabajador = NumTrabajador;
    }

    public String get_Nombres() {
        return this.Nombres;
    }

    public void set_Nombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String get_ApellidoP() {
        return this.Ap_Paterno;
    }

    public void set_ApellidoP(String Ap_Paterno) {
        this.Ap_Paterno = Ap_Paterno;
    }

    public String get_ApellidoM() {
        return this.Ap_Materno;
    }

    public void set_ApellidoM(String Ap_Materno) {
        this.Ap_Materno = Ap_Materno;
    }

    public int get_HorasExtra() {
        return this.Horas_Ex;
    }

    public void set_HorasExtra(int Horas_Ex) {
        this.Horas_Ex = Horas_Ex;
    }

    public int get_SueldoBase() {
        return this.Sueldo_B;
    }

    public void set_SueldoBase(int Sueldo_B) {
        this.Sueldo_B = Sueldo_B;
    }

    public int get_AñoIngreso() {
        return this.Año_Ing;
    }

    public void set_AñoIngreso(int Año_Ing) {
        this.Año_Ing = Año_Ing;
    }
    
    public double CalcularSueldo(){
        int Ant = 2022 - this.Año_Ing;
        Tolat = this.Sueldo_B + (this.Sueldo_B*(Ant*0.03)) + this.Horas_Ex * Horas_Ex;
        return Tolat;
    }
}
