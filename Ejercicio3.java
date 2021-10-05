import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la nota a evaluar (0-100): ");
        int nota = scan.nextInt();
        scan.close();
        System.out.println("Su nota: "+ nota + ", Calificación: " + calificar(nota));
    }
    public static String calificar(int nota) {
        String resultado = "";
        if (nota > 92) {
            resultado = "Excelente";
        } else if (nota > 84) {
            resultado = "Sobresaliente";
        } else if (nota > 74) {
            resultado = "Distinguido";
        } else if (nota > 59) {
            resultado = "Bueno";            
        } else {
            resultado = "Desaprobado";
        }
        return resultado;

        

        
    }
    
}
