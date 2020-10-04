/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaentradasusuario;

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
        
        Scanner objeto = new Scanner(System.in);
        String nombreUsuario;

        System.out.println("Ingresa nombre de usuario: ");
        nombreUsuario = objeto.nextLine(); //nextLine es para leer cadenas.
        
        System.out.println("El usuario es: " + nombreUsuario);
        
                //OTRO EJEMPLO
        Scanner objeto2 = new Scanner(System.in);
        System.out.println("Ingresa nombre, edad y salario: ");
        
        String nombre = objeto2.nextLine();
        int edad = objeto2.nextInt();
        double salario = objeto2.nextDouble();
        
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
    
}
        
        
        