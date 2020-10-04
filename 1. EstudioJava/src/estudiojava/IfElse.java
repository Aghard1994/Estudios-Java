
package estudiojava;

public class IfElse {
    public static void main(String[] args) {
        
    /*
    menor que: a < b
    menor o igual que: a <= b
    mayor que: a > b
    mayor o igual que: a >= b
    igual que a == b
    distinto a que: a != b
    */
    
    /*
    Use if para especificar un bloque de código que se ejecutará, si una condición especificada es verdadera.
    Use else para especificar un bloque de código que se ejecutará, si la misma condición es falsa.
    Use else if para especificar una nueva condición para probar, si la primera condición es falsa.
    Use el interruptor para especificar muchos bloques alternativos de código que se ejecutarán.
    */
    
    //if (condición). va con minúscula.
    if(10 > 6){
        System.out.println("10 es mayor que 6");
    }
    
    //también se pueden probar variables
    int x = 13;
    int y = 9;
    
    if(x > y){
        System.out.println("x es mayor que y");
    }
    
    int tiempo = 20;
    if(tiempo <= 19){
        System.out.println("Buenos días");
    }else{
        System.out.println("Buenas noches");
    }
    
    int tiempo2 = 22;
    if(tiempo < 10){
        System.out.println("Good morning");
    }else if (tiempo2 < 20){ //en el else if va otra condición
    System.out.println("Good day");    
    }else{
        System.out.println("Good evening");
    }
    
    //Puedes escribirlo así:
    int tiempo3 = 20;
    String resultado = (tiempo3 < 18) ? "Buenos díías" : "Buenas noches";
    System.out.println(resultado);
    
    
} 
}
