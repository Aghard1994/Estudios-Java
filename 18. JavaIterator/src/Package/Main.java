/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import java.util.ArrayList;
import java.util.Iterator;

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
        ArrayList<String> animales = new ArrayList<String>();
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        animales.add("Perro");
        animales.add("Gato");
        animales.add("Caballo");
        animales.add("Cerdo");
        numeros.add(3);
        numeros.add(5);
        numeros.add(8);
        numeros.add(12);
        
        //devolver el iterador
        Iterator<String> it = animales.iterator();
        Iterator<Integer> ite = numeros.iterator();
       
        //Imprimir el primer item
        //System.out.println(it.next());
        
        //loop a traves de una colección
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        while(ite.hasNext()){
            Integer i = ite.next();
            if(i < 10){ //elimina los números abajo de 10
                ite.remove();
            }
        }
        System.out.println(numeros);
    }
    
}
