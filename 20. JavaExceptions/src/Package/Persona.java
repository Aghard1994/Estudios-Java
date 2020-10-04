/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

/**
 *
 * @author Javier
 */
public class Persona {
    static void verificadorEdad(int edad){
        if(edad < 18){
            throw new ArithmeticException("Acceso denegado - debes tener arriba de 18 años para acceder");                    
        }else{
            System.out.println("Acceso permitido");
        }
    }
}
