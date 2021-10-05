import java.util.Scanner;

public class Ejercicio6b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char op;
        do{
            System.out.println("Ingrese 3 números: ");
            int numero1 = scan.nextInt();
            int numero2 = scan.nextInt();
            int numero3 = scan.nextInt();
            System.out.println("-----------------------");
            System.out.println("Primer número ingresado: " + numero1);
            System.out.println("Segundo número ingresado: " + numero2);
            System.out.println("Tercer número ingresado: " + numero3);
            System.out.println("-----------------------");
            System.out.println("Ingrese \"x\" para continuar, cualquier tecla para salir ");

            op = scan.next().charAt(0);
        }
        while (op == 'x');
        scan.close();
    }    
}
