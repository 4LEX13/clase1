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

         Lbros ObjetoLbro1 = new Lbros(1,"PROGRAMACION JAVA",100,"Deitel");
         Lbros ObjetoLbro2 = new Lbros(2,"PROGRAMACION PHP",60,"Deitel"); 
//         System.out.println(Lbro.toString());
         
        
        if(ObjetoLbro1.getNumeroPaginas()) < ObjetoLbro2.getNumeroPaginas(){
         
         
            System.out.println("El libro 2 es mayor que el libro 1)");
            
        }
        
    }
    
}
