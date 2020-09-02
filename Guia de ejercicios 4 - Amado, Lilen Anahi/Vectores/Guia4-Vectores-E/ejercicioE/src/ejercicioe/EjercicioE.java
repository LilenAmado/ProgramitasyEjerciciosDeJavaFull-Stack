package ejercicioe;

import java.util.Scanner;

/*@author Lilén Amado*/

public class EjercicioE {
    public static void main(String[] args) {
        /* Vectores - Ejercicio E:
        En tres vectores diferentes se guardan los datos de temperaturas máximas y
        mínimas de 5 ciudades de Misiones. En el primer vector se guardan los
        nombres de las ciudades, en el segundo las temperaturas mínimas alcanzadas
        y en el tercero las temperaturas máximas alcanzadas en la última semana. Se
        necesita un programa que permita la carga de las ciudades, sus temperaturas
        mínimas y máximas; además, deberá poder informar por pantalla cual fue la
        ciudad con la temperatura más baja y cual con la temperatura más alta (dando
        a conocer al mismo tiempo la cantidad de grados). */
        
        // Declarar vectores 
        String ciudades[] = new String[5];
        int min[] = new int [5];
        int max[] = new int [5];
        
        // Variables utilizadas 
        int i;
        boolean bandera = false;
        int maxima, minima; 
        String tempMax= "", tempMin="";
        
        /*************************** Carga **********************************************/
        
        // Scanner ciudades
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 5 ciudades (sin espacios entre palabras. Ej: SanVicente): ");
        
        // Carga de ciudades
        for(i=0; i<ciudades.length; i++){
            String tecladoA = teclado.next();
            ciudades[i] = tecladoA;
        }
        
        System.out.println("______________________________________________");
        
        // Scanner temperatura minima
        Scanner teclado2 = new Scanner(System.in);
        
        // Carga de temperatura minima
        for(i=0; i<min.length; i++){
            System.out.println("Ingrese temperatura mínima de " + ciudades[i] + ":");
            int tecladoB = teclado2.nextInt();
            min[i] = tecladoB;
        }
        
        System.out.println("______________________________________________");
        
        // Scanner temperatura minima
        Scanner teclado3 = new Scanner(System.in);
        
        // Carga de temperatura minima
        for(i=0; i<max.length; i++){
            System.out.println("Ingrese temperatura máxima de " + ciudades[i] + ":");
            int tecladoC = teclado3.nextInt();
            max[i] = tecladoC;
        }
        
        /********************************** Para resultados **************************************/
        
        // Temperatura minima
        minima = min[0];
   
        for(i = 0; i<min.length; i++){
            if(min[i] < minima){
                minima = min[i];
                bandera = true;
                String valorMin = Integer.toString(minima);
                tempMin = "La ciudad con la temperatura mínima es: "+ ciudades[i] + " con una temperatura de: "+ valorMin + "°";
            }
        }
        
        //Temperatura maxima
        maxima = max[0];
   
        for(i = 0; i<max.length; i++){
            if(max[i] > maxima){
                maxima = max[i];
                bandera = true;
                String valorMax = Integer.toString(maxima);
                tempMax = "La ciudad con la temperatura máxima es: "+ ciudades[i] + " con una temperatura de: "+ valorMax + "°";
            }
        }
        
        System.out.println("_________________________________________________");
        System.out.println(tempMin);
        System.out.println(tempMax);
        
    }
    
}
