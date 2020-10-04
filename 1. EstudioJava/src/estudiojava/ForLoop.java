package estudiojava;

public class ForLoop {
    public static void main(String[] args){  
        
         for (int i = 0; i < 5; i++){
        System.out.println(i);
        }
        
        for (int i = 0; i <= 10; i = i + 2){
        System.out.println(i);
    }      
        
        //for-each usa bucles para cada uno
        String[] autos = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : autos){
            System.out.println(i);
        }
    }
}
      

