
public class UsoEmpleado {
    public static void main(String[] args) {
        // Crear un objeto Empleado
        empleado empleado1 = new empleado("Juan", 2000, 5, 20, 3000.0);

        // Aumentar el sueldo en un 5%
        empleado1.subidaSueldo(5.0);

        // Mostrar los datos del empleado
        System.out.println(empleado1.getDatosEmpleado());

        // Crear un objeto Jefatura
        jefatura jefe1 = new jefatura("Ana", 1999, 6, 15, 5000.0);

        // Establecer un incentivo para el jefe
        jefe1.setIncentivo(1000.0);

        // Mostrar los datos del jefe
        System.out.println(jefe1.getDatosEmpleado());
    }
}
