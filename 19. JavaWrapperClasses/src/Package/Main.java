/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import java.util.ArrayList;

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
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        numeros.add(3);
        numeros.add(75);
        numeros.add(100);
        numeros.add(666);
        
        for(int i : numeros){
            System.out.println(i);
        }
        
        Integer in = 5;
        Double dou = 3.4;
        Character cha = 'J';
        System.out.println(in);
        System.out.println(dou);
        System.out.println(cha);
        //buscarlo por objetos específicos
        System.out.println(in.intValue());
        System.out.println(dou.doubleValue());
        System.out.println(cha.charValue());
        
        //método útil es el método toString (), que se utiliza para convertir objetos de contenedor en cadenas.
        
        Integer inte = 9000;
        String str = inte.toString();
        System.out.println(str.length());
    }
    
}
