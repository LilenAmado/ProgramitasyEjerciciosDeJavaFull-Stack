package Logica;
import java.util.Date;

//CLASE
public class Alumno {
    
    //Atributos
    String nombre;
    String apellido;
    Date fechaNac;
    String direccion;
    String dni;
    
    //Métodos
    
    //Procedimiento
    public void mostrarNombre(){
        System.out.println("El nombre del alumno es: " + nombre);
    }
    
    //Función
    public String obtenerNombre(){
        return (nombre);
    }
    
    //Creamos nuestro Contructor (ALT + INS)INSERT

    public Alumno() {
        
    }
    public Alumno(String nombre, String apellido, Date fechaNac, String direccion, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.direccion = direccion;
        this.dni = dni;
    }
    
}
