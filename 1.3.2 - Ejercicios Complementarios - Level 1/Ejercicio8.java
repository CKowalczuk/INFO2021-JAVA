import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        String cadena[] = new String[4];
        Scanner intro = new Scanner(System.in);
        System.out.println(" Nombre y Apellido \n Edad \n Dirección \n Ciudad");
        for (int i =0; i< 4; i++){
            cadena[i] = intro.nextLine();
        }
        for (int i =3; i>= 0; i--){
            System.out.print(cadena[i] + " - ");
            
        }
        
        
        intro.close();
    }
}
