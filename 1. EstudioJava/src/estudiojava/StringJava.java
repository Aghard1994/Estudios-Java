package estudiojava;

public class StringJava {
    public static void main(String[] args) {
        String saludos = "Hola huacho";
        System.out.println(saludos);
        
        String texto = "Que pasa";
        System.out.println("La longitud de la cadena de texto es: " + texto.length()); //lenght() te dice la longitud de la cadena String
        
        String texto2 = "Probando";
        System.out.println(texto2.toUpperCase()); //mayúsculas
        System.out.println(texto2.toLowerCase()); //minúsculas
        
        String texto3 = "Encuentra la ubicación del texto";
        System.out.println(texto3.indexOf("ubicación")); //Encuentra la palabra y localiza en que posición está con números.
        
        String nombre = "Klavier";
        String apellido = "Murray";
        System.out.println(nombre + " " + apellido); // el signo más en el String se utiliza para combinar entremedio
        
        //también puedes usasr el método concat, que concatena los Strings
        String nombre1 = "Javier ";
        String apellido1 = "Urra";
        System.out.println(nombre1.concat(apellido1));
        
        //Java no te dejara escribir comillas adentro de una comilla
        //Para arreglar ese problema debes colocar (\) 
        String texto4 = "Yo soy \"Klavier\" el asesino";
        System.out.println(texto4);
        
        String texto5 = "It\'s alright."; //para la comilla simple
        System.out.println(texto5);
        
        /*
        \n Salto de línea
        \r Retorno
        \t tab
        \b espacio
        \f
        */
        
        String x = "10";
        String y = "20";
        String z = x + y;
        System.out.println(z);
    }
}
