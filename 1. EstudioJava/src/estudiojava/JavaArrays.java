package estudiojava;

public class JavaArrays {
    public static void main(String[] args){
    //Arrays sirven para almacenar multiples valores en uan matriz
    //String[] debe tener los corchetes
    //colocar los valores dentro de llaves, separadas por comillas y coma
    //También se puede crear un array de enteros
        
    //Ejemplo de array seleccionando un elemento eligiendo un número
    String[] autos = {"Volvo", "BMW", "Ford", "Mazda"};
    //autos[2] = "Opel"; para cambiar un valor de un elemento
    System.out.println(autos[2]); //muestra la posición 2
    
    
    String[] ropa = {"polera", "pantalon", "calcetines", "boxer"};
    System.out.println(ropa.length); //para contar cuantos elementos hay dentro de una matriz
    
    
    String[] hospital = {"Médico", "Enfermero", "Paciente"};
    for (int i = 0; i < hospital.length; i++){
        System.out.println(hospital[i]);
        
    }
    
    String[] computador = {"Gabinete", "Mouse", "Teclado", "Pantalla"};
    for(String i : computador){
        System.out.println(i);
    }
    
    //MATRIZ MULTIDIMENSIONAL
    int[][] misNumeros = {{1,2,3,4}, {5,6,7}};
    int x = misNumeros [1][2];
    System.out.println(x);
    
    //También se puede usar un bucle for dentro de otro bucle, para tener los elementos del a matriz bidimensional
    int[][] otrosNumeros = {{1,2,3,4}, {5,6,7}};
    for(int i = 0; i < otrosNumeros.length; ++i){
        for(int j = 0; j < otrosNumeros[i].length; ++j){
            System.out.println(otrosNumeros[i][j]);
        }
    }
}
}
