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
        worker.setNombre("Pedro");
        worker.setPaterno("López");
        worker.setSeguro(90);
        
        if (worker.getSeguro() <=99) worker.setSeguro(100);
        
        
        System.out.println("El nombre es: " + worker.getNombre()  + " " +  worker.getPaterno() + " y el numero social es: " + worker.getSeguro());
        
        
        
        
        
        
        
    }
    
}
