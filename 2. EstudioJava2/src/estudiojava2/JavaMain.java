package estudiojava2;

public class JavaMain {
    public static void main(String[] args){
        ClaseConstructor objeto = new ClaseConstructor(10);
        System.out.println(objeto.x);
        
        Auto miAuto = new Auto(1969, "Mustang");
        System.out.println(miAuto.modeloAnio + " " + miAuto.nombreModelo);
    }

    
}
