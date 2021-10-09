import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = intro.nextLine();
        System.out.println("Ingrese la letra a detectar: ");
        char letra = intro.next().charAt(0);
        System.out.println("Cantidad de ocurrencias de la letra " + letra +": "+ detector(frase,letra));

        intro.close();
    }

    private static int detector(String frase, char letra) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++){
            if (letra == frase.charAt(i)){
                contador++;
            }
        }
    return contador;    
    }
    
}
