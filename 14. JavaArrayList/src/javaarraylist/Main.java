/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarraylist;

import java.util.ArrayList;
import java.util.Collections;
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
        ArrayList<String> autos = new ArrayList<String>(); //creando un objeto para ArrayList
        //Ahora agregar los artículos que van a estar dentro de la matriz
        autos.add("Volvo");
        autos.add("BMW");
        autos.add("Ford");
        autos.add("Mazda");
        Collections.sort(autos);
        //System.out.println(autos);
        //System.out.println(autos.get(2));
        //autos.remove(1);//elimina un artículo de la matriz, también debe ser con número
        //autos.clear();//para eliminar todos los articulos.
        //System.out.println(autos.size()); //saber el tamaño de la matriz
        //Se puede usar ArrayList con un for
        /*for(int i = 0; i < autos.size(); i++){
            System.out.println(autos.get(i));
        }*/
        //Se puede usar ArrayList con el ciclo for-each
        for(String i : autos){
            System.out.println(i);
        }
        
        //cadena en Java es igual a un objeto
        //Para acceder a la matriz hay que usar el método get y colocar el número y se empieza desde el 0
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(25);
        numeros.add(30);
        Collections.sort(numeros);
        //System.out.println(numeros);
        for(int i : numeros){
            System.out.println(i);
        }
    }
    
}
