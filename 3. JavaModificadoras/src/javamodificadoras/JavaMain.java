package javamodificadoras;

public class JavaMain {
    public static void main(String[] args){
        JavaFinal objeto = new JavaFinal();
        //objeto.x = 50; //va a generar error
        //objeto.PI = 3.14; //va a generar error
        System.out.println(objeto.x);
        
        //metodoEstatico(); //genera error
        
        //JavaStatic objeto = new JavaStatic();
        //objeto.metodoPublico();
        
        //Persona
        Estudiante objeto2 = new Estudiante();
        
        System.out.println("Nombre: " + objeto2.nombre);
        System.out.println("Edad: " + objeto2.edad);
        System.out.println("Año de graduación: " + objeto2.anioGraduacion);
        objeto2.estudio();
    }
}