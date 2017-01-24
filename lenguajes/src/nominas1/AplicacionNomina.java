/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nominas1;

/**
 *
 * @author Cesar
 */
public class AplicacionNomina {
    
    public static void main(String[] args) {
        
        Trabajador worker = new Trabajador();
        worker.nombre="Pedro";
        worker.Paterno="López";
        worker.Seguro=90;
        
        if (worker.Seguro <=99) worker.Seguro = 100;
        
        
        System.out.println("El nombre es: " + worker.nombre  + " " +  worker.Paterno + " y el numero social es: " + worker.Seguro);
        
        
        
        
        
        
        
    }
    
}
