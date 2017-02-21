/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones2;

import java.io.*;

/**
 *
 * @author T-102
 */
public class ValidacionArchivos {

public static void validarExtencion(File file)throws ExtensionNoValidaException{
 
    //Preguntamos el nombre
    String nombre = file.getName();
    //Como obtener la extension
    int indice1 = nombre.indexOf(".");
    int indice2 = nombre.length();
    String extension = nombre.substring(indice1-1, indice2);
    if(extension.equals("txt"))
        throw new ExtensionNoValidaException();
    
    //throw new ExtensionNoValidaException();
}
}
