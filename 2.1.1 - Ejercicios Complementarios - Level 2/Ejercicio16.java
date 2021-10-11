import java.util.HashSet;


/*
Se dispone de una lista de Empleados, de cada empleado se conoce:
Nombre y Apellido
DNI
horasTrabajadas
valorPorHora

Todos los empleados están cargados en un Set (HashSet), se desea calcular 
el sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego 
almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor
(value) es el sueldo calculado. 
*/

public class Ejercicio16 {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado(32345678,"Juan Perez",50,320);
        Empleado emp2 = new Empleado(23546854,"Lidia Gomez",56,310);
        Empleado emp3 = new Empleado(25365485,"Luis Trento",45,325);
    
        HashSet<Object> empleados = new HashSet<>();
        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);

        for (Object x : empleados){
            System.out.println(x);
        }
    }
}

