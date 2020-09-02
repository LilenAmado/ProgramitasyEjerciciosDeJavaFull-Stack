package ejerciciod;

import java.util.Scanner;

/* @author Lilén Amado */

public class EjercicioD {

    public static void main(String[] args) {
        /* Vectores - Ejercicio D:
        Un empleado desea almacenar en un vector sus 12 sueldos del año. A partir
        de esa carga, necesita un programa que determine y muestre por pantalla la
        suma total de sus 12 sueldos y el promedio de sueldo que tuvo en el año.
        */
        //Declaramos el Array
        int sueldo[] = new int [12];
        //Declaramos variables
        int i, suma = 0, promedio;
        
        //Declaramos Scanner
        Scanner teclado = new Scanner(System.in);
        
        
        for (i = 0; i<sueldo.length; i++){
            System.out.println("Ingrese sueldo n°" + (i+1) + ": ");
            int cantSueldo = teclado.nextInt();
            sueldo[i] = cantSueldo; 
        }
        
        for(i=0; i<sueldo.length ; i++ ){
            suma = suma + sueldo[i];
        }
        
        promedio = suma / sueldo.length;
        
        System.out.println("La suma total de su sueldo anual es: "+ suma + " y el promedio es: " + promedio);
    }
}
