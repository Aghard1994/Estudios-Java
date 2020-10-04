/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import java.util.HashSet;

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
        HashSet<String> autos = new HashSet<String>();
        HashSet<Integer> numeros = new HashSet<Integer>();
        autos.add("Ford");
        autos.add("BMW");
        autos.add("Mazda");
        autos.add("Ford");
        autos.add("Volvo");
        numeros.add(4);
        numeros.add(6);
        numeros.add(9);
        System.out.println(autos);
        //Se agregó dos veces Ford, pero no se puede repetir, porque cada elemento de un conjunto es único
        System.out.println(autos.contains("Ford")); //contains es para ver si tiene el Ford (con true o false)
        //autos.remove("BMW"); //para remover item
        //autos.clear() //para eliminar todos los ítems
        System.out.println(autos.size()); //ver tamaño de la matriz
        
        for(String i : autos){
            System.out.println(i);
        }
        
        for(int i = 1; i <= 10 ; i++){
            if(numeros.contains(i)){
                System.out.println(i + " Número encontrado en la lista");
            }else{
                System.out.println(i + " Número no encontrado en la lista");
            }
        }
        
    }
    
}
