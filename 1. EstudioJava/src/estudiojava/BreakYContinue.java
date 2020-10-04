package estudiojava;

public class BreakYContinue {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++){
            if(i == 4){
                break;
            }
            System.out.println(i);
        }
        
        //continue rompe una iteración en el ciclo
        
        for (int i = 0; i <= 10; i++){
            if(i == 4){
                continue;
            }
            System.out.println(i);
        }
        
        //break y continue también se puede usar en while
        /*
        EJEMEPLO BREAK
        int i = 0;
        while (i < 10){
            System.out.println(i);
            i++;
            if(i == 4){
                break;
            }
        }
        */
        //EJEMPLO CONTINUE
        int i = 0;
        while(i < 10){
            if(i == 4){
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
