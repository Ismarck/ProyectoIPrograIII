/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


/**
 *
 * @author marcosisaacarayaabarca
 */
public class Instructor extends Persona{

    private String Especialidad;
    
    public Instructor() {
    }

    public Instructor(String Especialidad, String Fecha_Nacimiento, String Correo, int Numero_Celular, int Cedula, char Sexo) {
        super(Fecha_Nacimiento, Correo, Numero_Celular, Cedula, Sexo);
        this.Especialidad = Especialidad;
    }
    

    @Override
    protected String Datos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
