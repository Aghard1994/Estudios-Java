package estudiojava;

public class Atributos {
    public static void main(String[] Args){
        AtributosA objeto = new AtributosA();
        AtributosA objeto2 = new AtributosA();
        Persona objeto3 = new Persona();
        //objeto.x = 35; //También se pueden modificar los valores de los artributos
        objeto2.x = 40;
        System.out.println(objeto.x);
        System.out.println(objeto2.x);
        System.out.println("Nombre: " + objeto3.nombre + " " + objeto3.apellido);
        System.out.println("Edad: " + objeto3.edad);
        
        
    }
}

