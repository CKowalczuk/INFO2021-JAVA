import java.util.*;

public class Ejercicio2 {
    private static String instrucciones = "Ingrese 3 números: ";
    private static String separador = "-----------------------";
    private static String continuar = "Ingrese \"x\" para continuar, cualquier otra tecla para salir";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char op = 'x';
        while (op == 'x'){
            System.out.println(instrucciones); 
            int numero1 = scan.nextInt();
            int numero2 = scan.nextInt();
            int numero3 = scan.nextInt();
            imprimirValores(numero1, numero2, numero3);
            op = scan.next().charAt(0); 
        }
        scan.close();
     }
    public static void imprimirValores(int numero1, int numero2, int numero3) {
        System.out.println("El Primer número ingresado es " + numero1);
        System.out.println("El Segundo número ingresado es " + numero2);
        System.out.println("El Tercer número ingresado es " + numero3); 
        System.out.println(separador); 
        System.out.println(continuar); 
    } 
}