import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número para identificar el día de la semana (1-7): ");
        
        int dia = scan.nextInt();
       
        if (dia > 0 && dia < 8){
            System.out.println("El día número "+dia+" Corresponde al día "+ clasificarDia(dia));
        } else {
            System.out.println("El día número "+dia+" Es incorrecto para el cálculo");
        }
        scan.close();
    }

    public static String clasificarDia(int dia) {
        String diaSemana = "";
        switch (dia) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Lunes";
                break;
            case 3:
                diaSemana = "Martes";
                break;
            case 4:
                diaSemana = "Miercoles";
                break;
            case 5:
                diaSemana = "Jueves";
                break;
            case 6:
                diaSemana = "Viernes";
                break;
            case 7:
                diaSemana = "Sábado";
                break;
        }
        return diaSemana;
        
    }
}
        


    

