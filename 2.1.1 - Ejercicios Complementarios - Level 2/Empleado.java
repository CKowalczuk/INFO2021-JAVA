public class Empleado {
    Integer dni;
    String NombreYApellido;
    Integer horasTrabajadas;
    Integer valorPorHora;
    
    public Empleado(int i,String NombreYApellido,Integer horasTrabajadas,Integer valorPorHora) {
        this.dni = i;
        this.NombreYApellido = NombreYApellido;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;

    }

    @Override
    public String toString() {
        return String.valueOf(this.dni) + 
                " - " + this.NombreYApellido + 
                " - " + (this.horasTrabajadas * this.valorPorHora);
    }
}
