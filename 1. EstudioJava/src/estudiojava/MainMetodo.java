package estudiojava;

import static estudiojava.ClaseMetodo.metodoEstatico;
import static estudiojava.ClaseMetodo.miMetodo;

public class MainMetodo {
    public static void main(String[] args){
        miMetodo();
        //método estático
        metodoEstatico();
        
        ClaseMetodo objeto = new ClaseMetodo();
        objeto.metodoPublico();
        
        //Clase auto
        Auto miAuto = new Auto();
        miAuto.acelerador();
        miAuto.velocidad(200);
    }
    
    
    
}
