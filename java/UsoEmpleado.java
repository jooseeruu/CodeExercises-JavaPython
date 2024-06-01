public class UsoEmpleado {
    public static void main(String[] args) {
        jefatura jefe_RRHH= new jefatura("Amador", 1994, 9, 24, 50000.00);
        jefe_RRHH.setIncentivo(3400.00);

        empleado[] misEmpleados = new empleado[5];
        misEmpleados[0] = new empleado("Juan", 2000, 8, 29, 43000.00);
        misEmpleados[1] = new empleado("Ana", 2001, 9, 15, 45000.00);
        misEmpleados[2] = new empleado("Pedro", 2002, 10, 1, 47000.00);
        misEmpleados[3] = jefe_RRHH; //Polimorfismo, principio de sustitución

        // Nueva instancia de Jefatura y hacer Casting
        misEmpleados[4] = new jefatura("Maria", 1995, 7, 26, 55000.00);
        jefatura jefa_finanzas = (jefatura) misEmpleados[4];
        jefa_finanzas.setIncentivo(3500.00);

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

/*
Tengo un array de Empleado que también puede contener objetos de cualquier subclase de Empleado, como Jefatura.

Esto es posible gracias al polimorfismo.
Un principio fundamental de la programación orientada a objetos que permite que una variable de un tipo de superclase pueda referirse a un objeto de cualquier subclase.

Cuando agregas un objeto Jefatura al array (por ejemplo, misEmpleados[3] = jefe_RRHH;).
Lo estás almacenando como un Empleado debido al tipo del array. Sin embargo, sigue siendo un Jefatura en términos de sus propios métodos y campos.

Por lo tanto, si quieres acceder a los métodos específicos de Jefatura que no están en Empleado (como setIncentivo),
necesitas hacer un casting para decirle al compilador que trate ese Empleado como un Jefatura.

Por ejemplo, en tu código haces esto con jefa_finanzas
 */