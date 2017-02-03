/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patos;

/**
 *
 * @author T-102
 */
public class PatoMexicano extends Pato implements ComportamientoVolar{
   public static final String color="Blanco";

    @Override
    public void volar() {
        System.out.println("Soy pato mexicano y no vuelo");
    }
   
   
}
