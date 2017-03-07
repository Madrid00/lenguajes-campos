/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionexamen;

/**
 *
 * @author Cesar
 */
public class Prestamo {
    
    public static void prestarAlumnos(Alumno alumno)throws Exception{
        
        if(alumno.getLibros().length >3)throw new Exception();
    }
    public static void prestarProfesor(Profesor profesor)throws Exception{
        if(profesor.getLibros().length >=2)throw new Exception();
    }
}
