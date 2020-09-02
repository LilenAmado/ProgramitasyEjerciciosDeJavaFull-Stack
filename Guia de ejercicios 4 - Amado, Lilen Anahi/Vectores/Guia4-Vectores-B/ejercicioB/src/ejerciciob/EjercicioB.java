package ejerciciob;

import java.util.Scanner;

/* @author Lilén Amado */

public class EjercicioB {

    public static void main(String[] args) {
        /* Vectores - Ejercicio B:
        Realizar un programa que permita la carga por teclado de 10 números en un
        vector. Una vez cargados, se necesita que el programa determine cuál es el
        mayor y cuál es el menor de ellos.
        */
        
        // Array
        int numeros[] = new int[10];
        
        // Scanner
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese los 10 números");
        
        // Pedimos los números al usuario
        for(int i = 0; i < 10; i++){
            int num = teclado.nextInt();
            numeros[i] = num;
        }
        System.out.println("______________________________");
        System.out.println("Los números ingresados son los siguientes: ");
        
        // Recorremos y mostramos el array
        for(int i = 0; i < 10; i++){
            System.out.println(numeros[i]);
        }
        
        // Mostrar por pantalla el mayor y el menor número ingresado
        
        int mayor, menor; 
        mayor = menor = numeros[0];
        // Entonces va a seguir buscando
        
        for(int i = 0; i<numeros.length; i++){
            if(numeros[i] > mayor){
                mayor = numeros[i];
            }
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }
        
        System.out.println("______________________________");
        System.out.println("El numéro mayor es: " + mayor);
        System.out.println("El numéro menor es: " + menor);
    }
}
