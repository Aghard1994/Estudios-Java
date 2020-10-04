package estudiojava;

public class MetodoSobrecarga {
    public static void main(String[] args){
        //Con la sobrecarga de métodos, varios métodos pueden tener el mismo nombre con diferentes parámetros:
        
        //int miMetodo(int x)
        //double miMetodo(double x, double y)
        //float miMetodo(float x)
        
        int numero = metodoInt(4, 5);
        double numero2 = metodoDouble(3.4, 1.3);
        System.out.println("Número int: " + numero);
        System.out.println("Número double: " + numero2);
    }
    
    static int metodoInt(int x, int y){
        return x + y;
    }
    
    static double metodoDouble(double x, double y){
        return x + y;
    }
    
    //también se puede hacer con el mismo método, sobrecargar el mismo.
}
