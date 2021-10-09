import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        String nombre = intro.nextLine();
        System.out.println("HOLA "+ nombre + "!!!");
        intro.close();
    }
}
