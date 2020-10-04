
package estudiojava;


public class CastingTipoJava {
    public static void main(String[] args) {
        //Ampliación de casteo
        //cambiar de pequeño a grande.
        int myInt = 7;
        double myDouble = myInt; //Lo castea automáticamente
        
        System.out.println(myInt);
        System.out.println(myDouble);
        
        //Estrechamiento de casteo
        //Se estrecha manualmente.
        
        double miDouble = 5.12;
        int miInt = (int) miDouble;
        
        System.out.println(miDouble);
        System.out.println(miInt);
    }
}
