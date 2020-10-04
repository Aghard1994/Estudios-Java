/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterfaces;

/**
 *
 * @author Javier
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cerdo cerdito = new Cerdo(); //no se puede crear un objeto de la clase "Animal" porque es Interface, lo mismo que las clases abstractas
        cerdito.sonidoAnimal();
        cerdito.dormir();
        
        Demo demostracion = new Demo();
        demostracion.metodo();
        demostracion.metodos();
    }
    
}
