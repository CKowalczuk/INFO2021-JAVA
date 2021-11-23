package ejerciciosComplementariosLevel3;
import static java.util.stream.Collectors.toMap;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(
            new Alumno("Perez",  "Juan",  LocalDate.parse("1969-11-20")),
            new Alumno( "Gomez",  "Pedro", LocalDate.parse("1993-05-29")),
            new Alumno( "Gonzalez",  "Carlos", LocalDate.parse("1998-11-05")),
            new Alumno( "Fernandez",  "Osvaldo",  LocalDate.parse("2007-01-12")),
            new Alumno( "Gutierrez",  "Esteban",  LocalDate.parse("1998-06-10"))
        );
        Map<String, Integer> alumnosMap = alumnos.stream()
                        .collect(toMap(alumno -> generarClave(alumno), alumno -> generarEdad(alumno)));

        System.out.println(alumnosMap);
}

    private static Integer generarEdad(Alumno alumno) {
        return Period.between(alumno.getFechaDeNacimiento(), LocalDate.now()).getYears();
    }

    private static String generarClave(Alumno alumno) {
        return alumno.getApellido() + " " + alumno.getNombre();
    }
}

