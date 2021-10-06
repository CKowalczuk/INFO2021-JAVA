import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Ingrese un número para obtener la tabla de producto hasta 10: ");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        scan.close();

        for (int a=1; a <=10; a++){
            System.out.println(numero + " x " + a + " = "+ numero * a);
        }
    }
    
}
