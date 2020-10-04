package javamodificadoras;

public class JavaStatic {
    //Un método estático significa que se puede acceder sin crear un objeto de la clase, a diferencia de public:
    static void metodoEstatico(){
        System.out.print("Se pueden invocar métodos estáticos sin crear objetos.");  
    }
    
    public void metodoPublico(){
        System.out.println("Los métodos públicos deben llamarse creando objetos");
    }
    
    
}
