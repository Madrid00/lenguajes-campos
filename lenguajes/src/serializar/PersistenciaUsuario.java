/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author Cesar
 */
public class PersistenciaUsuario {
    /*Primer metodo del tipo accion guardar*/
    ArrayList<Usuario> usuarios = new ArrayList <>();
    
    public void guardar(Usuario u)throws Exception{
        File file = new File("Tabla-Usuarios");
        if(file.exists())usuarios=buscarTodos();
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        usuarios.add(u);
        oos.writeObject(usuarios);
    }
    
    //Buscar todos
    public ArrayList<Usuario> buscarTodos()throws Exception{
        
        File file = new File("Tabla-Usuario");
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        usuarios= (ArrayList<Usuario>) ois.readObject();
        return usuarios; 
        
   }
    
    
    public Usuario buscar(String nombre) throws Exception{
        File file = new File("Basesita-Usuarios");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        Usuario us = (Usuario)ois.readObject();
        if(us.getNombre().equals(nombre)){
            return us;
        }else{
            return null;
        }    
        }
        //buscar por id
        
        public Usuario buscarPorId(int id)throws Exception{
            Usuario buscado=null;
            usuarios = buscarTodos();
            int [][] x = new int[4][];
            //comienza la busqueda 
         buscado= usuarios.get(id);
         return buscado;
        }
         
         
        
    }  
    
