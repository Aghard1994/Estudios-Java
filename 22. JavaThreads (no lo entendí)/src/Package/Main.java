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
public class Main extends Threads{
    public static void main(String[] args) {
        Threads thread = new Threads();
        thread.start();
        
        while(thread.isAlive()){
            
        }
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
    
    public void run(){
        amount++;
    }
}

    

