import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese una palabra en minúsculas: ");
        String palabra = intro.nextLine();
        System.out.println(mayusculas(palabra));
        intro.close();
    }
    
    private static String mayusculas(String palabra) {
        String pal = "";
        for (int i=0; i < palabra.length() ; i++){
            pal = pal + (char)((int)(palabra.charAt(i))-32);
        }
        return pal;
    }
}
