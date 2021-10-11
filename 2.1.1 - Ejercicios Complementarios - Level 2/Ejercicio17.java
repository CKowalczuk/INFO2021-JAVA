/*
Crear una función que dado 2 argumentos (int, siendo el primero menor al 
segundo), nos devuelva un array de Strings. Con la secuencia de números 
enteros de principio a final. Pero si el número es multiplo de 2 colocara 
el valor “Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de
ambos colocara “FizzBuzz”. 
Observacion: Los 2 argumentos indican con que valor se arranca a calcular
y el segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4 

Input (Entrada):
fizzBuzzFuncion(1,6)    // 6 si marca el límite y no se lo incluye
fizzBuzzFuncion(1,8)

Output (Salida):
[“1”, “Fizz”, “Buzz”, “Fizz”, 5]
[“1”, “Fizz”, “Buzz”, “Fizz”, “5”, “FizzBuzz”, “7”]
*/
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese un rango de números: ");
        int num1 = intro.nextInt();
        int num2 = intro.nextInt();
        cargarArray(num1, num2);
        intro.close();
    }

    public static void cargarArray(int num1, int num2) {
        // String secuencia[] = new String[num2];
        ArrayList<String> secuencia = new ArrayList<String>();
        
        for (int x = num1; x < num2; x++){
            if (((x % 2) == 0) && ((x % 3) != 0)){
                secuencia.add("Fizz");
            }
            else if (((x % 2) == 0) && ((x % 3) == 0)){
                secuencia.add("FizzBuzz");
                }
            else {
                if (x % 3 == 0){
                secuencia.add("Buzz");
                }
                else{
                secuencia.add(String.valueOf(x));
                }
            } 
        }
        System.out.print(secuencia);
    }
}
