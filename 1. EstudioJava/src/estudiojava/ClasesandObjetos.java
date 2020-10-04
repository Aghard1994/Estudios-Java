package estudiojava;

public class ClasesandObjetos {
    int x = 5;
    int y = 3;
    
    
    public static void main(String[] args){
        ClasesandObjetos miObjeto = new ClasesandObjetos();
        System.out.println(miObjeto.x);
        
        ClasesandObjetos objeto1 = new ClasesandObjetos();
        ClasesandObjetos objeto2 = new ClasesandObjetos();
        System.out.println(objeto1.y);
        System.out.println(objeto2.y);
        
    }
}


