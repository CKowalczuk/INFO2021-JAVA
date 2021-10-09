import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese el Primer número: ");
        int num1 = intro.nextInt();
        System.out.println("Ingrese el Segundo número: ");
        int num2 = intro.nextInt();
        System.out.println(num1 + " x "+ num2 + " = " + producto(num1,num2));
        intro.close();
    }

    private static int producto(int num1, int num2) {
        int res = 0;
        for (int i = 1; i <= num2; i++){
            res = res + num1;
        }
        return res;
    }
}
