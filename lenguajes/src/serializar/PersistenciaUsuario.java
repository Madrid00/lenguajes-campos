/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;
import java.io.*;
/**
 *
 * @author Cesar
 */
public class PersistenciaUsuario {
    /*Primer metodo del tipo accion guardar*/
    public void guardar(Usuario u)throws Exception{
        File file = new File("Basesita-Usuarios");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(u);
    }
}
