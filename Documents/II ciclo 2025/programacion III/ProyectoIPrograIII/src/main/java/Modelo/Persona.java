/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author marcosisaacarayaabarca
 */
public abstract class Persona {

    private String Fecha_Nacimiento;
    private String Correo;
    private int Numero_Celular;
    private int Cedula;
    private char Sexo;
    
    protected Persona() {
    }

    protected Persona(String Fecha_Nacimiento, String Correo, int Numero_Celular, int Cedula, char Sexo) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Correo = Correo;
        this.Numero_Celular = Numero_Celular;
        this.Cedula = Cedula;
        this.Sexo = Sexo;
    }
   
    protected abstract String Datos();
}
