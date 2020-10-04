package javaenumeraciones;

import javaenumeraciones.Enumeracion.Level;
import javaenumeraciones.Enumeracion.Nivel;

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
        Level variable = Level.MEDIUM;
        System.out.println(variable);
        
        Nivel variable2 = Nivel.NORMAL;
        
        
        switch(variable2){
            //caso 1
            case BAJO: 
                System.out.println("Nivel bajo");
                break;
                //caso 2
                case NORMAL: 
                System.out.println("Nivel normal");
                break;
                    //caso 3
                    case ALTO:
                System.out.println("Nivel alto");
                break;
        }
                
        
        //recorrer la matriz con un for
        for(Nivel variable3 : Nivel.values()){
            System.out.println(variable3);
        }
    }
    
    //Las enumeraciones son como las clases, pero con atributos, metodos finales, no se pueden cambiar
    //No pueden hacer herencia como las clases, pero si implementar
    //Las enumeraciones sirven para datos fijos como fechas, hora, etc.
    
}
