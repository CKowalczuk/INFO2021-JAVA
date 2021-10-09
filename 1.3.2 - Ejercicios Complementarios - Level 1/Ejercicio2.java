import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int numero1 = intro.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int numero2 = intro.nextInt();
        System.out.println("La suma de los números es : " + suma(numero1,numero2));
        System.out.println("La resta de los números es : " + resta(numero1,numero2));
        if (numero2 != 0){
            System.out.println("La división de los números es : " + division(numero1,numero2));
            System.out.println("El resto de los números es : " + modulo(numero1,numero2));
        }else{
            System.out.println("No es posible calcular la división y módulo por 0");
        }
        System.out.println("La multiplicación de los números es : " + multiplicacion(numero1,numero2));
        
        intro.close();
    }    
    private static int modulo(int numero1, int numero2) {
        return numero1 % numero2;
    }

    private static float division(int numero1, int numero2) {
        return numero1 / numero2;
    }

    private static int multiplicacion(int numero1, int numero2) {
        return numero1 * numero2;
    }

    private static int resta(int numero1, int numero2) {
        return numero1 - numero2;
    }

    private static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }
    
}
