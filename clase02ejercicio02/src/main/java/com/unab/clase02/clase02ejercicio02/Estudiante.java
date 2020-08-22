/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.clase02.clase02ejercicio02;

/**
 *
 * @author kevin
 */
public class Estudiante extends persona {
    
  private int Matricula;
  private String Carrera;

    public Estudiante (String Nombre, String Direecion, String FechaNC, String Genero, int Edad, int Matricula,String Carrera){
    
        this.Nombre = Nombre;
        this.Direccion = Direecion;
        this.FechaNC = FechaNC;
        this.Genero = Genero;
        this.Edad = Edad;
        this.Matricula = Matricula;
        this.Carrera = Carrera;
        
    }

    @Override
    public String toString() {
        return "Estudiante{"+",Nombre=" + Nombre + ", Direccion=" + Direccion + ", FechaNC=" + FechaNC + ", Genero=" + Genero + ",Matricula=" + Matricula + ", Carrera=" + Carrera + '}';
    }
  
    
}
