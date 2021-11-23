/*Se dispone de una lista de Integer, de la cual queremos obtener otra lista 
aplicando la operación de factorial pero no se desean valores repetidos.
*/

package ejerciciosComplementariosLevel3;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 4, 4, 4);
        List<Integer> calculados = numeros.stream()
            .map(numero -> factor(numero))
            .distinct()
            .collect(Collectors.toList());
        System.out.println(calculados);
    }

    public static Integer factor(Integer n) {
        if (n == 1) {
            return 1;
        }
        return n * factor(n - 1);
    }
    
}
