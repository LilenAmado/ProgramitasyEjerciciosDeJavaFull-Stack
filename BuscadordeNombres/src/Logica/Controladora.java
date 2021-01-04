package Logica;


public class Controladora {
    
    
    String nombres [] = new String[5];
    Boolean bandera = true; 
    
    //FUNCION CARGAR NOMBRE
    public void cargarNombres(String nombre){
        
        for(int i = 0; i < nombres.length; i++){
            
            if(bandera == true && nombres[i]== null){
                nombres [i] = nombre;
               //nombres = nombres.length;
               bandera = false;
               
            }
            
        }
        bandera = true;
    }
    
    //FUNCION BUSCAR NOMBRE
    public boolean buscarNombre(String buscarTxt){
        
        Boolean bandera2 = false; 
        
        for(int i = 0; i < nombres.length; i++){
            
            if(nombres[i].equals(buscarTxt)){
                bandera2 = true;
            }
            
        }
        return bandera2;
    }
}
