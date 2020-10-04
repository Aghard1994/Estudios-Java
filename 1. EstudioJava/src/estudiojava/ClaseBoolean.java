package estudiojava;
public class ClaseBoolean {
    public static void main(String[] args) {
        //booleand es verdad y falso.
        
        boolean persona = true;
        boolean perro = false;
        System.out.println(persona);
        System.out.println(perro);
        
        //Se pueden usar operadores matemáticos, para averiguar una expresión si es verdadera
        int x = 10;
        int y = 3;
        System.out.println(x > y); //va a retornar verdadero si 10 es mayor que 3
        
        //Incluso más fácil:
        System.out.println(10 > 3);
        
        //también sirve con las operaciones igual (==)
        int a = 3;
        System.out.println(a == 3);
        System.out.println(5 == 7);
    }
}
