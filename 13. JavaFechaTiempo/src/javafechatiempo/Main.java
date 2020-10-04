/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafechatiempo;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
        LocalDate objeto = LocalDate.now();
        LocalTime objeto2 = LocalTime.now();
        LocalDateTime objeto3 = LocalDateTime.now();
        
        System.out.println(objeto);
        System.out.println(objeto2);
        //System.out.println(objeto3);
        System.out.println("Before Formatting: " + objeto3);
        DateTimeFormatter objetoFormato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); //método ofPattern acepta todo tipo de valores si deseas mostrar la fecha en formatos diferentes.
        
        String formattedDate = objeto3.format(objetoFormato);
        System.out.println("After Formatting: " + formattedDate);
        
    }
    
}

