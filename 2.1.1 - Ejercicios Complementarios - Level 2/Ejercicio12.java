import java.util.Scanner;
import java.util.ArrayList;

/*Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero 
al principio de la lista y otro al final. Por último, iterar e imprimir los 
elementos de la lista y el tamaño de la misma (antes y después de agregar a
 en la primera y última posición).
*/

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        ArrayList<Integer> volcado = new ArrayList<Integer>();
        int primero = 0;
        int ultimo = 0;
        System.out.println("Ingrese 5 valores: ");
        for (int i = 0; i < 5; i++){
            lista.add(intro.nextInt());
        }
        System.out.println("Ingrese 2 valores para agregar como primero y ultimo: ");
        primero = intro.nextInt();
        ultimo = intro.nextInt();

        System.out.println("la Longitud del Array es: " + lista.size());
        for (int i=0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        System.out.println("la Longitud del ListArray es: " + lista.size());
        
        volcado = (ArrayList<Integer>) lista.clone();

        lista.clear();

        lista.add(primero);


        for (int i=0; i < volcado.size(); i++){
            lista.add(volcado.get(i));
        }
        lista.add(ultimo);

        System.out.println("Ahora la Longitud del ListArray es: " + lista.size());

        for (int i=0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        intro.close();
    }
}
