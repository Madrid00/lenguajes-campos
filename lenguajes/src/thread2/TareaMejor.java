/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread2;

import org.omg.PortableServer.REQUEST_PROCESSING_POLICY_ID;

/**
 *
 * @author T-102
 */

//Implementando la segunda forma de crear Thread implementando la interface Runnable
public class TareaMejor implements Runnable{
    public static void main(String[] args) {
        Runnable r = new TareaMejor();
        Thread t1 = new Thread(r);
        //Iniciando
        t1.start();
        
    }
    @Override
    public void run() {
        System.out.println("Soy un Thread Mejor!!");  
    }
}
