import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese un valor entero: ");
        int num = intro.nextInt();
        secuencia(num);
                
        intro.close();
    }
    public static void secuencia(int num) {
        for (int i = 1; i <= num; i++){
            for (int e = 1; e <= i; e++){
                System.out.print(e+" ");
            }
            System.out.println("");
        }
    }
    
}
