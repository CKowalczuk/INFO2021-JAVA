/*
Crear una lista que contenga como elementos la numeración de cartas de una baraja
francesa (solo los valores, no figuras). Se deberá cargar el ArrayList (en orden),
imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el arrayList
 y volver a imprimir.
Ayuda: ArrayList implementa la interface Collection, existe algún método que me 
permita hacer la operación sort (mezclar) aleatoriamente? Idem para el reverso
*/
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio13 {
    public static void main(String[] args) {
        ArrayList<Integer> baraja = new ArrayList<Integer>();
        for(int i=1; i<=10; i++){
            baraja.add(i);
        }
        imprimirBaraja(baraja);
        System.out.println("--------Inverso-----------");
        imprimirInverso(baraja);
        System.out.println("--------Mezclado----------");
        imprimirMezcla(baraja);


    }
    public static void imprimirBaraja(ArrayList<Integer> baraja) {
        for (int i : baraja){
            System.out.println(i);
        }
    }
    public static void imprimirInverso(ArrayList<Integer> baraja) {
        Collections.reverse(baraja);
        for (int i : baraja){
            System.out.println(i);
        }
    }
    public static void imprimirMezcla(ArrayList<Integer> baraja) {
        Collections.shuffle(baraja);
        for (int i : baraja){
            System.out.println(i);
        }
            
    }
}
