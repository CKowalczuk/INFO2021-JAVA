import java.util.Scanner;

public class Ejercicio6a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        int numero = 0;
        while (continuar == 1) {
            System.out.println("Ingrese un número: ");
            numero = scan.nextInt();
            System.out.println("El número ingresado es: " + numero);
            System.out.println("Para continuar ingrese 1: ");
            continuar = scan.nextInt();
        }
        scan.close();
    }
    
}
