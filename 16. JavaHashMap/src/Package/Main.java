/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import java.util.HashMap;

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
        HashMap<String, String> ciudadesCapitales = new HashMap<String, String>();
        HashMap<String, Integer> persona = new HashMap<String, Integer>();
        ciudadesCapitales.put("England", "London");
        ciudadesCapitales.put("Germany", "Berlin");
        ciudadesCapitales.put("Norway", "Oslo");
        ciudadesCapitales.put("USA", "Washington DC");
        System.out.println("----------------------------");
        persona.put("Javier", 25);
        persona.put("Juanito", 25);
        persona.put("Pato", 23);
        
        //ciudadesCapitales.remove("USA");
        System.out.println(ciudadesCapitales);
        System.out.println(ciudadesCapitales.size());
        System.out.println(ciudadesCapitales.get("Germany"));
        //ciudadesCapitales.clear();
        
        for(String i : ciudadesCapitales.keySet()){
            System.out.println(i);
            
        }
        System.out.println("-----------------------");
        
        for(String i : ciudadesCapitales.values()){
            System.out.println(i);
            
        }
        System.out.println("-----------------------");
        
        for(String i : ciudadesCapitales.keySet()){
            System.out.println("Key: " + i + " Value: " + ciudadesCapitales.get(i));
            
        }
        
        for(String i : persona.keySet()){
            System.out.println("Nombre: " + i + " Edad: " + persona.get(i));
        }
        
    }
    }
    

