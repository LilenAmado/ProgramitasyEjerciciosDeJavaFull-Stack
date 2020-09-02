package ejercicioc;

import java.util.Scanner;

/* @author Lilén Amado */
public class EjercicioC {

    public static void main(String[] args) {
        /* Matrices - Ejercicio C: 
        En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de
        secundario. Cada fila corresponde a las notas y al promedio de cada alumno.
        • Se necesita un programa que permita a un profesor cargar en las 3
        primeras posiciones de cada fila las notas del alumno y que en la última
        columna se calculen los promedios.
        • Una vez realizados los cálculos, se desea mostrar las 3 notas de cada
        alumno y el promedio correspondiente recorriendo la matriz. */
        
        // Matriz
        double notas [][] = new double [4][4];
        // variables
        double promedio = 0; 
        double suma; 
        // Scanner
        Scanner teclado = new Scanner(System.in);
        
        // Carga de notas
        for(int f = 0; f < 4; f++){
            System.out.println("Introduzca notas del " + (f + 1) + "° alumno: ");
            for(int c = 0; c < 3; c++){
                double nota = teclado.nextDouble();
                notas[f][c] = nota;
            }
        }
        
        // Suma para calcular promedio 
        for(int f = 0; f < 4; f++){
            suma = 0;
            for(int c = 0; c < 3; c++){
                suma = suma + notas[f][c];
            }
            notas[f][3] = suma / 3;
        }
        
        System.out.println("________________________");
        
        // Por pantalla
        for(int f = 0; f < 4; f++){
            System.out.println("Las notas del "+ (f+1) + "° alumno fueron: ");
            for(int c = 0; c < 3; c++){
                 System.out.println("Nota n°" + (c+1) + " es: " + notas[f][c]);
            }
            System.out.println("Y el promedio es: " + notas[f][3]);
            System.out.println("________________________");
        }
       
    }
    
}
