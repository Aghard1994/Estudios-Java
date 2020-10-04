package javaencapsulamiento;

public class Persona {
    
    private String nombre; //donde es privada no se puede acceder desde afuera
    
    public String getNombre(){ //devuelve el valor de la variable.
        return nombre;
    }
    
    public void setNombre(String nuevoNombre){ //toma al parámetro y le asigna a la variable
        this.nombre = nuevoNombre;
    }
}


