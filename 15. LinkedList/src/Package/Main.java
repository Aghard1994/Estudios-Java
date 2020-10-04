/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import java.util.LinkedList;

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
         LinkedList<String> autos = new LinkedList<String>();
        autos.add("Volvo");
        autos.add("BMW");
        autos.add("Ford");
        autos.add("Mazda");
        System.out.println(autos);
        
        //es mejor usar ArrayList, porque accede a elementos aleatorios
    }
    
}
