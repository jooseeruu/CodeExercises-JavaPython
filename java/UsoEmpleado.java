public class UsoEmpleado {
    public static void main(String[] args) {
        jefatura jefe_RRHH= new jefatura("Amador", 1994, 9, 24, 50000.00);
        jefe_RRHH.setIncentivo(3400.00);
        empleado[] misEmpleados = new empleado[5];
        misEmpleados[0] = new empleado("Juan", 2000, 8, 29, 43000.00);
        misEmpleados[1] = new empleado("Ana", 2001, 9, 15, 45000.00);
        misEmpleados[2] = new empleado("Pedro", 2002, 10, 1, 47000.00);
        misEmpleados[3] = jefe_RRHH; //Polimorfismo, el principio de sustitución (se puede utilizar un objeto de la subclase (jefatura) siempre que el programa espere un objeto de la superclase(empleado))
        for (empleado e: misEmpleados) {
            if (e != null) {
                e.subidaSueldo(5);
            }
        }
        for (empleado e : misEmpleados) {
            if (e != null) {
                System.out.println(e.getDatosEmpleado());
            }
        }
    }
}
