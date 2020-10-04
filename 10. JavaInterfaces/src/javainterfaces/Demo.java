
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainterfaces;

import javainterfaces.SegundaInterface;
import javainterfaces.PrimeraInterface;

/**
 *
 * @author Javier
 */
class Demo implements PrimeraInterface, SegundaInterface {

    
    public void metodo() {
       System.out.println("Hola");
    }

    
    public void metodos() {
        System.out.println("Chao");
    }
   
}