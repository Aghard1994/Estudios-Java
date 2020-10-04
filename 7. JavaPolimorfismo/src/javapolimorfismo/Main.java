package javapolimorfismo;

public class Main {

    public static void main(String[] args) {
        Animal miAnimal = new Animal();
        Animal miPerro = new Perro();
        Animal miCerdo = new Cerdo();
        
        miAnimal.sonidoAnimal();
        miPerro.sonidoAnimal();
        miCerdo.sonidoAnimal();
    }
    
}
