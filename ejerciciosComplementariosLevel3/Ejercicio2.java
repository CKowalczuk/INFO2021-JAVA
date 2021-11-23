/*Dada una lista que contiene números enteros, se deberá generar otra lista que 
contendrá el resultado de aplicar la operación de potencia a 2.*/
package ejerciciosComplementariosLevel3;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        List<Integer> cuadrado = numeros.stream()
        .map(numero -> potencia(numero))
        .collect(Collectors.toList());
        System.out.println(cuadrado);
    }

    public static Integer potencia(Integer n) {
        return n * n;
    }
}
