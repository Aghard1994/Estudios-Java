/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclasesinternas;

/**
 *
 * @author Javier
 */
public class Externa {
    int x = 10;
    
    class Interna{ //una clase interna puede ser privada, para que la externa no pueda acceder, al compilar va a dar error
        int y = 5;
    }
}
