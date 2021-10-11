/*
Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos 
en 3 cursos (3 arrayList) e imprimir dichos cursos.

Ayuda: ArrayList posee un método para particionar en sub-listas?

*/
// import java.util.Collections;
import java.util.ArrayList;

public class Ejercicio14 {
    public static void main(String[]args) {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Juan");
        lista.add("Pedro");
        lista.add("Lidia");
        lista.add("Roberto");
        lista.add("Rosa");
        lista.add("Lucas");
        lista.add("Esteban");
        lista.add("Miguel");
        lista.add("Ines");
        lista.add("Orlando");
        lista.add("Mirta");
        lista.add("Elsa");
        imprimirCursos(lista);
        
    }
    public static void imprimirCursos(ArrayList<String> lista) {
        System.out.println(lista.subList(0, 4));
        System.out.println(lista.subList(4, 8));
        System.out.println(lista.subList(8, 12));

    }   
}
