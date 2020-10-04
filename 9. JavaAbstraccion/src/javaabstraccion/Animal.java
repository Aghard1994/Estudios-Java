/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaabstraccion;

/**
 *
 * @author Javier
 */
abstract public class Animal { //no se pueden crear objetos en clases abstractas
    public abstract void sonidoAnimal();
    public void dormir(){
        System.out.println("ZZzZZZzZZZzz");
    }
}
