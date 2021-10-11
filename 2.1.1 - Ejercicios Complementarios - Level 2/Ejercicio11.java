import java.util.Scanner;

// Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, 
// luego imprimir por pantalla el ranking

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        String ciudades[] = new String[3];
        System.out.println("Ingrese sus ciudades favoritas: ");
        
        for (int i = 0; i < 3; i++){
            ciudades[i]= intro.nextLine();
        }
    
        for (int i=0; i < ciudades.length; i++){
            System.out.println("#" + (i+1) + " - " +ciudades[i]);
        }
        intro.close();
        
    }
}
