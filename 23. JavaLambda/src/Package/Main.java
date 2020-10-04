/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import java.util.ArrayList;
import java.util.function.Consumer;

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
        ArrayList numeros = new ArrayList();
        numeros.add(1);
        numeros.add(2);
        numeros.add(5);
        numeros.add(7);
        numeros.add(10);
        //numeros.forEach((n) -> {System.out.println(n);});
        Consumer metodo = (n) -> {System.out.println(n);};
        numeros.forEach(metodo);
        
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hola", exclaim);
        printFormatted("Hola", ask);
                
                
    }

    private static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
    
}
