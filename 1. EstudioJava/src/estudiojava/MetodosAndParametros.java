package estudiojava;

public class MetodosAndParametros {
   static void miMetodo(String primerNombre){
        System.out.println(primerNombre + " Urra");
    }
    
    static void otroMetodo(String pNombre, int edad){
        System.out.println(pNombre + " Tiene " + edad);
    }
    //En los métodos anteriores no se mostró retornos de valores
    //Pero si se puede hacer
    //void valores de no retorno
    
    static int anotherMetodo(int x){
        return 5 + x;
    }
    
    static int otherMetodo(int x, int y){
        return x + y;
    }
    
    /*
    También puede almacenar el resultado en una variable (recomendado, 
    ya que es más fácil de leer y mantener):
    */
    
    static int diferenteMetodo(int x, int y){
        return x + y;
    }
    
    static void verificarEdad(int edad){
        if(edad < 18){
            System.out.println("Acceso denegado, debes ser mayor de 18 años");
        }else{
            System.out.println("Acceso autorizado!!!");
        }
    }
    
    public static void main(String[] args){
        miMetodo("Javier");
        miMetodo("Pedro");
        miMetodo("Hugo");
        
        otroMetodo("Javier", 25);
        otroMetodo("Manuel", 56);
        otroMetodo("Javier", 12);
        
        System.out.println(anotherMetodo(3)); //es como decir "5 + 3"
        System.out.println(otherMetodo(5,3));
        
        int z = diferenteMetodo(5,4);
        System.out.println(z);
        
        verificarEdad(20);
    }
    
    
    
    
}
