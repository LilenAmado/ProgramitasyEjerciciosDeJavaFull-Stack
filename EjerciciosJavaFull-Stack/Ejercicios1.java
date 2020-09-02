/* Tiene que aparecer todo esto */
package ejercicios.pkg1;
import java.util.Scanner; 
/* @author Lilo Amado */
public class Ejercicios1 {
    /*** @param args the command line arguments ***/
    public static void main(String[] args) {
               
        // TODO code application logic here
         
        //System.out.println("Hola mundo"); 
        // Int, string, boolean, float (para declarar una variable)
        
        /*
        Ejercicio No 1: Tipos de datos
            1- Determinar qué tipo de dato podría ser utilizado para los siguientes
            datos:
                a. 5,45 = float
                b. 10 = int
                c. 358 = int
                d. Leonardo = string
                e. Verdadero = boolean
                f. 78,3 = float
        
            2- Brindar al menos 2 ejemplos de cada uno de los siguientes tipos de datos
                a. Entero 23 28
                b. Real 23,4 28,5
                c. Lógico 
                d. Caracter 
        */
        
        /*
            Ejercicio No 2: Variables
                1- Determinar ¿Cuáles de los siguientes nombres de variables son válidos?
                Justificar por qué
                a. Fecha de Nacimiento = No, porque tiene espacios
                b. @pellido = No, porque comienza con @
                c. nombre = Si, porque es un caracter string
                d. cant_hijos = zi
                e. tiene-pc = no
                f. edad = Si, porque si
                g. DNI = zi
                h. nombre.persona = No, tiene punto
                i. nombre&apellido = No, &
                j. em@ail = No, @
                k. dirección = No, tiene tilde
        */
        
        /*
            Ejercicio No 3: Variables
                a) Un chico de primaria necesita realizar un algoritmo para dar valores a tres
                números. Decidió llamar a las variables num1, num2 y num3 y colocarles los
                valores 5, 3 y 7. Sin embargo, no sabe de qué tipos de datos deberían ser
                sus tres variables ni tampoco como asignar dichos valores. Realizar un
                programa que declare las variables y les asigne los valores que el chico
                necesita para cumplir con su tarea. */
                
                    int num1 = 5; 
                    int num2 = 3;
                    int num3 = 7;
                    
                    System.out.println(num1+" "+num2+" "+num3);
                    
                    
        
                /*b) Una estudiante está dando sus primeros pasos en la programación y quiere
                realizar un programa que permita calcular cualquier porcentaje de un número.
                Para ello necesita que el usuario ingrese por teclado el número a calcular
                el porcentaje (por ejemplo 2500) y también el porcentaje que se desea
                calcular (por ejemplo si quiere calcular 10% debería ingresar 0,10). A
                partir de estos valores, necesita que el algoritmo calcule el porcentaje
                (multiplicar el primer número por el valor del porcentaje), lo guarde en
                una variable y se muestre por pantalla. ¿Podrías ayudarla a realizar el
                programa? */
              
                /** 
                Scanner nom = new Scanner(System.in); 
                System.out.println("Escribi tu nombre");
                String nombre = nom.nextLine();
                System.out.println("Tu nombre es " + nombre);
                **/
                
                /*Scanner num = new Scanner(System.in);
                System.out.println("Ingrese el numero");
                int numero = num.nextInt();
                
                Scanner por = new Scanner(System.in);
                System.out.println("Ingrese el porcentaje que desea calcular en numero, ejemplo 10% = 0.10");
                double porcentaje = por.nextDouble();
                
                double resultado = numero * porcentaje; 
                
                System.out.println("Tu resultado es " + resultado);
                 
                
                /*
                c) Un comerciante realiza 5 ventas por día. Necesita de un programa que le
                permita ingresar por teclado los montos de las 5 ventas y luego sumar el
                total de todas ellas para mostrar por pantalla el resultado. ¿Podrías
                ayudarlo a realizar el programa?*/
                
                /*Scanner num1 = new Scanner(System.in);
                System.out.println("Ingrese monto de num 1");
                double numero1 = num1.nextDouble();
                System.out.println("El numero que ingresó es: "+ numero1);
                
                Scanner num2 = new Scanner(System.in);
                System.out.println("Ingrese monto de num 2");
                double numero2 = num2.nextDouble();
                System.out.println("El numero que ingresó es: "+ numero2);
                
                Scanner num3 = new Scanner(System.in);
                System.out.println("Ingrese monto de num 3");
                double numero3 = num3.nextDouble();
                System.out.println("El numero que ingresó es: "+ numero3);
                
                Scanner num4 = new Scanner(System.in);
                System.out.println("Ingrese monto de num 4");
                double numero4 = num4.nextDouble();
                System.out.println("El numero que ingresó es: "+ numero4);
                
                Scanner num5 = new Scanner(System.in);
                System.out.println("Ingrese monto de num 5");
                double numero5 = num5.nextDouble();
                System.out.println("El numero que ingresó es: "+ numero5);
                
                double resultado = numero1 + numero2 + numero3 + numero4 + numero5; 
                System.out.println("El resultado es: " + resultado);*/
                
                /*
                d) Realizar un programa que calcule el IVA de un producto. Para esto, el
                usuario debe poder ingresar por teclado el valor del producto y el programa
                debe informarle por pantalla qué monto equivale al IVA. Recordar que el IVA
                es igual al 21% (0,21).*/
                /*
                Scanner num = new Scanner(System.in);
                System.out.println("Ingrese el valor del producto");
                double numero = num.nextDouble();
                double iva = 0.21;
                double resultado = (numero * iva) + numero;
                System.out.println("El resultado es: " + resultado);
                
                /*
                e) Realizar un programa que permita a un profesor calcular el promedio de un
                alumno. Para esto, el algoritmo debe permitir ingresar las 4 notas del
                mismo(por ejemplo, 8, 7, 9.50 y 10), luego calcular el promedio de las
                mismas y mostrar el resultado por pantalla. Se recuerda que el promedio es
                la suma de todas las notas dividido la cantidad, en el ejemplo sería:
                (8+7+9.50+10)/4.
                
                
                Scanner nota1 = new Scanner(System.in);
                System.out.println("Ingrese nota");
                double numero1 = nota1.nextDouble();
                System.out.println("La nota que ingresó es: " + numero1);
                
                Scanner nota2 = new Scanner(System.in);
                System.out.println("Ingrese nota");
                double numero2 = nota1.nextDouble();
                System.out.println("La nota que ingresó es: " + numero2);
                        
                Scanner nota3 = new Scanner(System.in);
                System.out.println("Ingrese nota");
                double numero3 = nota1.nextDouble();
                System.out.println("La nota que ingresó es: " + numero3);
                
                Scanner nota4 = new Scanner(System.in);
                System.out.println("Ingrese nota");
                double numero4 = nota1.nextDouble();
                System.out.println("La nota que ingresó es: " + numero4);
                
                double resultado = (numero1 + numero2 + numero3 + numero4) / 4 ;
                System.out.println("El promedio es: " + resultado);
                */
                
                /*
                f) Realizar un programa que permita calcular el área de un triángulo. Se
                recuerda que la fórmula para calcular el área de un triángulo es: (base *
                altura) / 2. Se debe permitir al usuario ingresar la base y la altura,
                mientras que el programa debe calcular el área y mostrar el resultado por
                pantalla.
                
                Scanner base = new Scanner(System.in);
                System.out.println("Ingrese base");
                double base1 = base.nextDouble();
                
                Scanner altura = new Scanner(System.in);
                System.out.println("Ingrese altura");
                double altura1 = altura.nextDouble();
                
                double resultado = (base1 * altura1) / 2 ;
                System.out.println("El área es: " + resultado);
                */
                
                
                /*
                g) Realizar un programa que permita intercambiar el valor de dos variables.
                Por ejemplo, si la variable1 vale 5 y la variable2 vale 12, hacer que la
                variable1 valga 12 y la variable2 valga 5. Tener en cuenta que al asignar
                un valor a una variable se sobrescribe el valor anterior.*/
                
                /*
                Scanner num1 = new Scanner(System.in);
                System.out.println("Escribe numero 1");
                double numero1 = num1.nextDouble();
                
                Scanner num2 = new Scanner(System.in);
                System.out.println("Escribe numero 2");
                double numero2 = num1.nextDouble();
                
                System.out.println(numero2);
                System.out.println(numero1);
                
                */
    }
    
}
