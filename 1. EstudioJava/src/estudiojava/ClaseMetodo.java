package estudiojava;

public class ClaseMetodo {
    static void miMetodo(){
        System.out.println("Qué pasa choro!");
    }
    //Probando método estático
    static void metodoEstatico(){
        System.out.println("Se pueden llamar métodos estáticos sin crear objetos.");
    }
    
    //método público
    public void metodoPublico(){
        System.out.println("Los métodos públicos deben llamarse creando objetos");
    }
}
