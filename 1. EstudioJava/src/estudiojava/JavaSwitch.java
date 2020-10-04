package estudiojava;

public class JavaSwitch {
    public static void main(String[] args) {
        int dia = 4;
        switch(dia){
            case 1:
                System.out.println("Lunes");
                break; //Es un descanso, para evitar que lea todo el código
                case 2:
                System.out.println("Martes");
                break;
                case 3:
                System.out.println("Miércoles");
                break;
                case 4:
                System.out.println("Jueves");
                break;
                case 5:
                System.out.println("Viernes");
                break;
                case 6:
                System.out.println("Sábado");
                break;
                case 7:
                System.out.println("Domingo");
                break;
                default: //No necesita un break
                System.out.println("Esperando el fin de semana");
        }
    }
}
