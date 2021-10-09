import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese el Primer número: ");
        int num1 = intro.nextInt();
        System.out.println("Ingrese el Segundo número: ");
        int num2 = intro.nextInt();
        System.out.println(num1 + " elevado a "+ num2 + " = " + potencia(num1,num2));
        intro.close();
    }

    private static int potencia(int num1, int num2) {
        int res = 1;
        for (int i = 1; i <= num2; i++){
            res = res * num1;
        }
        return res;
    }
}
