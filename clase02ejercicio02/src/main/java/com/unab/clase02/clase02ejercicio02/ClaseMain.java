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
public class ClaseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Profesor profe = new Profesor("Kevin","Guarjila","11/10/2001","M",18,"Bachiller","estudiante");
        System.err.println(profe.toString());
        
        Estudiante est = new Estudiante("Jenny","chalate","11/10/2001","F",28,1500,"Ing. sistema y computacion");
        
        System.out.println(est.toString());
    }
    
}
