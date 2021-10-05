public class Ejercicio7 {
    private static String bienvenida = "Bienvenido";

    public static void main(String[] args) {
        System.out.println(bienvenida);
        String hola = "Hola";
        imprimirTextoXVeces(hola,3);
    }
    public static void imprimirTextoXVeces(String texto, int contador) {
        for (int x = 1; x <= contador; x++){
            System.out.println(texto);
        }
    }        
    
    
}
