/*Dada una lista que contiene valores de tipo String, se deberá 
filtrar todos los valores que NO sean null o vacío ("").*/

package ejerciciosComplementariosLevel3;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");

        List<String> noNulas = palabras.stream()
        .filter(nn -> nn != null && nn != "")
        .collect(Collectors.toList());
        System.out.print(noNulas);
    }
}
