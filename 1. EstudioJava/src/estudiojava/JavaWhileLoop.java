package estudiojava;

public class JavaWhileLoop {
    public static void main(String[] args) {
        /*
        Bucles
    Los bucles pueden ejecutar un bloque de código
    siempre que se alcance una condición específica.
    Los bucles son útiles porque ahorran tiempo, 
    reducen errores y hacen que el código sea más legible.
        */
        /*
        int i = 0;
        while (i < 5){
            System.out.println(i);
            i++; //esto va sumando, va contando.
        }
        */
        
        int i = 0;
        do{
            System.out.println(i);
            i++;
        }
        while (i < 5);
        
    }   
    }