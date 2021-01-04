package Logica;

import java.util.Date;

public class main {

    public static void main(String[] args) {
           
        //Instanciamos el objeto 
        
        //Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno("Lilén", "Amado", new Date(), "lalala", "54645654");
        
        //Accedo a los metodos de la clase 
        
        alumno2.mostrarNombre(); //Procedimiento (no devuelve dato)
        
        String nombreDesdeFuncion = alumno2.obtenerNombre(); //Función (devuelve dato)
        System.out.println("El nombre traido desde la función es: " + nombreDesdeFuncion);
    }
    
}
