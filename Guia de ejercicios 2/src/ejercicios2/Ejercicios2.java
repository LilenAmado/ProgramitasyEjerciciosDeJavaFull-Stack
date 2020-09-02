/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios2;
import java.util.Scanner; 
/**
 *
 * @author Lilo Amado
 */
public class Ejercicios2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* EJERCICIO 1 */
         /*Realizar un  programa que muestre por pantalla los numeros del 1 al 35(UNO ABAJO DEL OTRO)utilizar una 
        estructura repititva. */
        System.out.println("Ejercicio 1");
        
        int contador = 1;
        System.out.println("Números del 1 al 35: ");
        while (contador<36){
            System.out.println(contador);
            contador++;
        }
    /***************************************************/ 
        /* EJERCICIO 2 */
        /* Realizar un programa que dado por teclado un límite numérico (por ejemplo: 100) muestra en pantalla 
        todos los números hasta ese límite (empezando por 1) */
        
        System.out.println("_____________________________________________________");
        
        System.out.println("Ejercicio 2");
        
            
        Scanner limite = new Scanner(System.in);
        System.out.println("Ingrese numero entero");
        int limite2 = limite.nextInt();
        
        int contador2 = 1;
        while(contador2 <= limite2){
            System.out.println(contador2);
            contador2++;
        }
        
         /***************************************************/ 
        /* EJERCICIO 3 */
        /* Realizar un programa que muestre por pantalla los números del 200 al 250, saltando de 2 en 2. 
        La secuencia debería ser: 200, 202,... etc. 
        */
        
        System.out.println("_____________________________________________________");
        System.out.println("Ejercicio 3");
        
        int contador3 = 200;
        
        System.out.println(contador3);
        
        while (contador3 <= 248){
            contador3 = contador3 + 2;
            System.out.println(contador3);
        }

//        System.out.println("_____________________________________________________");   
//        System.out.println("Modo kaki");    
//        int num = 200;
//        while( num <= 250){
//            System.out.println("N: " + num);
//            num += 2;
//        }

         /***************************************************/ 
        /* EJERCICIO 4 */
        /* Realizar un programa que lleve a cabo la cuenta regresiva para el año nuevo. La cuenta debe comenzar en 10
        y terminar en 1.
        */
        
        System.out.println("_____________________________________________________");
        System.out.println("Ejercicio 4");
        
        int contador4 = 10;
        
        while(contador4>0){
            System.out.println(contador4);
            contador4-=1;
            //contador4--;
        }
        
         /***************************************************/ 
        /* EJERCICIO 5 */
        /* Realizar un programa que muestre en pantalla palabras que sean ingresadas por teclado hasta que se increse
        la palabra "salir".
        */
        
        System.out.println("_____________________________________________________");
        System.out.println("Ejercicio 5");
        
        String palabra4="";

        while(!palabra4.equals("salir")){
            Scanner palabra = new Scanner(System.in);
            System.out.println("Ingrese palabras y cuando quiera terminar ingrese 'salir'");
            palabra4 = palabra.nextLine();
            
            System.out.println("Su palabra es: "+palabra4);
        }
        
        System.out.println("Finalizó el programa ya que su palabra fue: "+palabra4);
        
        
        /***************************************************/ 
        /* EJERCICIO 6 */
        /* Un gerente de una empresa prestadora de servicios de internet necesita un
            algoritmo que permita realizar el cálculo del monto a pagar de la factura
            de consumo de internet de 5 clientes de una empresa. Para ello, el algoritmo
            debe solicitar por teclado dos datos: Dni del cliente y tipo de servicio.
            Los tipos de servicio son 3:
            1. Internet 30 megas (cuyo valor es de $750 – 10% de descuento)
            2. Internet 50 megas (Cuyo valor es de $930 – 5% de descuento)
            3. Internet 100 megas (Cuyo valor fijo es de $1200)
            El algoritmo debe poder calcular el monto a pagar (dependiendo del tipo de
            servicio con el que cuente el cliente) e informar por pantalla el dni del
            mismo junto con el monto a pagar y el número de servicio con el que cuenta.
        */
        
        System.out.println("_____________________________________________________");
        System.out.println("Ejercicio 6");
        
        String dni;
        int tipo, count6 = 6, cliente = 1;
        double resultado;
        
        while(cliente < count6){
            Scanner teclado6 = new Scanner(System.in);
            System.out.println("Ingrese el dni: ");
            dni = teclado6.nextLine();
            
            Scanner teclado62 = new Scanner(System.in);
            System.out.println("Ingrese número de servicio (1: Internet 30 megas - 2: Internet 50 megas - 3: Internet 100 megas)");
            tipo = teclado62.nextInt();
            
            if(tipo==1){
                resultado = 750 - (750*0.10);
                System.out.println("El monto a pagar es de: $"+resultado);
            }else if(tipo==2){
                resultado = 930 - (930*0.05);
                System.out.println("El monto a pagar es de: $"+resultado);
            }else if(tipo==3){
                resultado = 1200;
                System.out.println("El monto a pagar es de: $"+resultado);
            }else{
                System.out.println("El número de servicio es incorrecto.");
            }
            cliente++;
        }
    }
}
