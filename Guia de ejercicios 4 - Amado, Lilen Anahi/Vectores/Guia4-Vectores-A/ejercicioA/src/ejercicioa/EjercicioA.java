package ejercicioa;

import java.util.Scanner;

/* @author Lilén Amado */

public class EjercicioA {
    public static void main(String[] args) {
        /* Vectores - Ejercicio A: 
        Llevar a cabo un programa que incluya un vector que almacene los siguientes
        nombres: Alejandra, Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa y
        Ludmila. Realizar un recorrido del vector para cargar los datos y otro
        recorrido para mostrar los mismos por pantalla.
        */
        
        // Declaro el array
        String Nombres[] = new String[8];
        
        // Scanner 
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca 8 nombres");
        
        // Pide 8 nombres al usuario  
        for(int i = 0; i<8; i++){
            String Nombre = teclado.next();
            Nombres[i] = Nombre;
        }
        // Recorre el array mostrando los nombres
        for(int i = 0; i<8; i++){
            System.out.println("El nombre es: " + Nombres[i] + ". Está ubicado en el índice: " + (i+1));
        } 
    }  
}
