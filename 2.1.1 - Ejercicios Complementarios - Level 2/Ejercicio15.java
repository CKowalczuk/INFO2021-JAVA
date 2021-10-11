/*
Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2)
del resumen de carga de horas semanal de un empleado. Se debe generar otra lista
que contenga los totales y luego imprimir el total final a cobrar.
Input (Entrada):
[6, 7, 8, 4, 5]
[350, 345, 550, 600, 320]

## Los arrays son iguales y corresponden a los días trabajados de una semana
Lun-Vie.

Output (Salida):
[2100, 2415, 4400, 2400, 1600]
Total Final: $ 12915

*/

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        ArrayList<Integer> horas = new ArrayList<Integer>();
        ArrayList<Integer> valores = new ArrayList<Integer>();
        ArrayList<Integer> totales = new ArrayList<Integer>();
        
        System.out.println("Ingrese Horas Trabajadas: ");
        for (int i = 0; i < 5; i++){
            horas.add(intro.nextInt());
        }
        System.out.println("Ingrese Valor de Hora: ");
        for (int i = 0; i < 5; i++){
            valores.add(intro.nextInt());
        }
        for (int x = 0; x < horas.size(); x++) {
			Integer hora = horas.get(x);
            Integer valor = valores.get(x);
            totales.add(hora * valor);
        }
        
        System.out.println(totales);
        intro.close();
    }
    
}
