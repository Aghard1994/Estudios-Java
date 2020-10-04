package javamodificadoras;

//Clase abstracta
abstract class Persona {
    //Un método abstracto pertenece a una clase abstracta y no tiene cuerpo. El cuerpo es proporcionado por la subclase:

    public String nombre = "Javier";
    public int edad = 25;
    public abstract void estudio();
}

//Subclase (heredar de Persona)
class Estudiante extends Persona{
    public int anioGraduacion = 2020;
    public void estudio(){ //el cuerpo del método abstracto se proporciona aquí))
    System.out.println("Estudiando todo el día");    
    }
}