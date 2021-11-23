/*Se dispone de una lista de Strings, de la cual saber la cantidad de valores 
que comiencen con la letra B (tanto mayúscula como minúscula, en ese caso decimos 
que será ignoreCase).
*/

package ejerciciosComplementariosLevel3;

import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        System.out.println(contarB(palabras));
    }

    public static Long contarB(List<String> palabras) {
        Long lista = palabras.stream()
            .filter(palabra -> palabra.startsWith("B") || palabra.startsWith("b"))
            .count();
        return lista;
    }

}
