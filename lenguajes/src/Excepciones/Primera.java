/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Cesar
 */
public class Primera {
    public static void main(String[] args) {

    //Vamos a ver primero la familia de excepciones que el compilador se hace cargo de ella
    //int x = 0;
    //float y = 2;
    
// Este renglon manda una excepcion que se llama ArithmeticException
      //  System.out.println(y/x);
        
        //int [] arreglos={1,2,3};
        //System.out.println(arreglos[3]);
        try{
        float a = 2;
        float b = Float.parseFloat("veinte");
        System.out.println(a*b);
    
    }catch (Exception hola){
            System.out.println(hola.getMessage());
        }
    }
    
}
