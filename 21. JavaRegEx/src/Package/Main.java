/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visita W3Schools");
        boolean matchFound = matcher.find();
        
        if(matchFound){
            System.out.println("Match encontrado");
        }else{
            System.out.println("Match no encontrado");
        }
    }
    
}
