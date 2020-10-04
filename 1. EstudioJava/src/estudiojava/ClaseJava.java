//CLASES DE VARIABLES
package estudiojava;

public class ClaseJava {
    public static void main(String[] args) {
      System.out.println("Hola mundo");
      //Los comentarios sirven de guía para entender el código JAVA
      
    //String caracteres y comillas
      String nombre = "John";
      System.out.println(nombre);
      
    //int números enteros
      int numero = 47;
      System.out.println(numero);
      
    //Puedes declarar variables sin asignar valor, puedes dárselo después.
      int numero2;
      numero2 = 50;
      System.out.println(numero2);
      
      int numero3 = 15;
      numero3 = 20; //Ahora el número pasa a 20
      System.out.println(numero3);
      
      /* esto genera un error final int numero4 = 30;
      numero4 = 34; */
           
      //EJEMPLOS DE DECLARACIÓN DE VARIABLES:
      
      int numero5 = 10;
      float numero6 = 5.99f;
      char letra = 'A';
      boolean verdad = true;
      String texto = "Hola";
      
      //Combinar texto en método println() se usa el caracter +
      String nombre2 = "Javier";
      System.out.println("Hola " + nombre2);
      
      //También puede usar el carácter + para agregar una variable a otra variable
      String nombre3 = "Javier ";
      String apellido = "Urra";
      String nombreCompleto = nombre3 + apellido;
      System.out.println(nombreCompleto);
      
      //Para los valores numéricos el signo + sirve como operaciones matemáticas.
      int x = 5;
      int y = 10;
      System.out.println(x + y);
      
      //Declarar más variables del mismo tipo se pueden usar comas
      int a = 5, b = 6, c = 44;
      System.out.println(a + b + c);
    }
}
