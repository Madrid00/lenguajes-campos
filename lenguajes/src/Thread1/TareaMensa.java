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

//Primera forma de crear Threads heredando la clase Thread

public class TareaMensa extends Thread{

    @Override
    public void run() {
        System.out.println("Soy un Thread!!!");
    }
    
}
