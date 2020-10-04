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
public class Estatico {
    int x = 4;
    static class Internou{ //Clase interna estática no tiene acceso a la clase externa
        int y = 9;
    }
}
