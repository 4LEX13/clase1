/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.clase02;

/**
 *
 * @author kevin
 */
public class ClaseInicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("hola");
//        System.out.println(Lbro.toString());
//        System.out.println(ObjetoLbro2.getNumeroPaginas());
        Lbros ObjetoLbro1 = new Lbros(1, "PROGRAMACION JAVA", 100, "Deitel");
        Lbros ObjetoLbro2 = new Lbros(2, "PROGRAMACION PHP", 600, "Deitel");

        ObjetoLbro1.setNumeroPaginas(200);
//      
//        
        if (ObjetoLbro1.getNumeroPaginas() < ObjetoLbro2.getNumeroPaginas()) {

            System.out.println("El libro 2 tiene mayor numero de paginas que el libro 1,rl libro 2 tiene un numrto de paginas de  "+ObjetoLbro2.getNumeroPaginas());

            System.err.println("la informacion del libro 2 es "+ObjetoLbro2.toString());
        } else {
            System.out.println("El libro 1 tiene mayor numero de paginas que el libro 2,el libro 1 tiene un numero de paginas de "+ObjetoLbro1.getNumeroPaginas());
            System.err.println("la informacion del libro es "+ObjetoLbro2.toString());
        }
    }

}
