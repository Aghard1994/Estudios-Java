/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

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
        int x;
        int y;
        int suma;
        
        Scanner objeto = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        x = objeto.nextInt(); //para leer el número que vas a ingresar
        
        System.out.println("Ingrese otro número: ");
        y = objeto.nextInt(); //para que lea el otro número
        
        suma = x + y;
        System.out.println("El resultado es: " + suma);
    }
    
}
