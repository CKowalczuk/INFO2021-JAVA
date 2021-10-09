import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese un número entero para calcular el factorial :");
        int num = intro.nextInt();
        System.out.println("El factorial de" + num + " es: "+ factorial(num));
        intro.close();

    }
    public static int factorial(int num) {
        if (num <= 0) {
          return 1;
        } else {
          return num *= factorial(num - 1);
        }
    }
}
