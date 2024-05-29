
public class UsoEmpleado {
    public static void main(String[] args) {
        // Crear un objeto Empleado
        empleado empleado1 = new empleado("Juan", 2000, 5, 20, 3000.0);

        // Aumentar el sueldo en un 5%
        empleado1.subidaSueldo(5.0);

        // Mostrar los datos del empleado
        System.out.println(empleado1.getDatosEmpleado());
    }
}
