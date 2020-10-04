/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import static Package.Persona.verificadorEdad;



/**
 *
 * @author Javier
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        verificadorEdad(14);
        // TODO code application logic here
        /*
        try{
            //Acá ba el código que se va a probar
        }catch(Exception e){
            //Código para manejar errores
        } */
        
        try{
            int[] numeros = {1,2,3};
            System.out.println(numeros[10]);
        }catch(Exception e){
            System.out.println("Algo salió mal");
        }finally{
            System.out.println("'Try Catch' finalizó");
        }
        
        
    }
    
    
    
}
