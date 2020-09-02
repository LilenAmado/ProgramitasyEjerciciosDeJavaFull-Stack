package ejerciciob;

import java.util.Scanner;

/* @author Lilén Amado */

public class EjercicioB {

    public static void main(String[] args) {
        /* Matrices - Ejercicio B:
        Llevar a cabo un programa que permita cargar mediante teclado una matriz de
        3 x 3 (3 filas, 3 columnas) con razas de perros. Una vez cargada la misma,
        será necesario realizar un recorrido por la misma y mostrar los datos
        cargados por pantalla. */
        
        String razas [][] = new String [3][3];
        
        // Declaro Scanner
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese razas de perros");
        
        for(int f = 0; f < 3; f++){
            for(int c = 0; c < 3; c++){
                String raza = teclado.next();
                razas[f][c] = raza;
            }
        }
        
        System.out.println("______________________________________________");
        
        // Mostrar por pantalla las razas ingresadas
        
        for(int f = 0; f < 3; f++){
            for(int c = 0; c < 3; c++){
                System.out.println("La raza ingresada es: " + razas[f][c]);
            }
        }
    }
}
