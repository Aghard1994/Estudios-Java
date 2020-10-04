package javapaquetesapi;

import java.util.Scanner; //importa una clase
import java.util.*; //importa el 

public class JavaPaquetesAPI {

    public static void main(String[] args) {
        Scanner objeto = new Scanner(System.in);
        String nombreUsuario;
        
        //Ingrese el nombre de usuario y presione Entrar
        System.out.println("Ingresa el nombre de usuario: ");
        nombreUsuario = objeto.nextLine();
        
        System.out.println("El nombre de usuario es: " + nombreUsuario);
    }
    
}
