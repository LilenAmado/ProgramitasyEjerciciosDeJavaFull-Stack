package ejercicioc;

import java.util.Scanner;

/* @author Lilén Amado */
public class EjercicioC {
    public static void main(String[] args) {
        /* Vectores - Ejercicio C: 
        Realizar un programa que permita la carga por teclado de 15 números en un
        vector. Una vez cargados, se necesita que el programa cuente e informe por
        pantalla cuántas veces se cargó el número 3 (si es que fue cargado alguna
        vez).
        */
        // Declarando Array
        int numeros[] = new int[15];
        
        // Variables
        int i;//Declaro indice
        int numBuscar = 3; //Declaro numero a buscar 
        boolean bandera = false; //Declaro Bandera
        int suma = 0; //Declaro la suma de cant. veces
        
        // Declaro Scanner para comenzar a cargar
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese los 15 números");
        
        // Carga de numeros
        for(i = 0; i<numeros.length; i++){
            int num = teclado.nextInt();
            numeros[i] = num;
        }
        
        // Bucle de busqueda
        for(i = 0; i<numeros.length; i++){
            if(numBuscar == numeros[i]){
                suma = suma + 1;
                bandera = true;
            }
        }
        
        // Si se encontró
        if (bandera == true){
            System.out.println("Se encontró " + suma + " veces el número 3");
        }
        // No se encontró
        if (bandera==false){
            System.out.println("No se encontró el número 3");
        }
    }
    
}
