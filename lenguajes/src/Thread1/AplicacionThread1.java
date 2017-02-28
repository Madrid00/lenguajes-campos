/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread1;

/**
 *
 * @author T-102
 */
public class AplicacionThread1 {
    public static void main(String[] args) {
        //Creando tarea Mensa
        TareaMensa t1 = new TareaMensa();
        //Iniciando
        t1.start();
        //Ejecucion
        try{
            Thread.sleep(5000);
            t1.start();
        }
        catch(InterruptedException e)
        {         
        }
        //La muerte viene cuando acaba de ejecutarse
        
    }
    
}
