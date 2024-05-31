import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

// Clase empleado que representa a un empleado con su nombre, fecha de alta y sueldo.
public class empleado {
    private String nombre; // Nombre del empleado
    private Date fechaAlta; // Fecha de alta del empleado
    private Double sueldo; // Sueldo del empleado

    // Constructor de la clase empleado.
    public empleado(String nombre, int año, int mes, int dia, Double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        GregorianCalendar calendar = new GregorianCalendar(año, mes - 1, dia);
        fechaAlta = calendar.getTime();
    }

    // Método para aumentar el sueldo del empleado basado en los años trabajados y un porcentaje.
    public void subidaSueldo(double porcentaje) {
        Calendar ahora = Calendar.getInstance();
        Calendar fechaAltaCal = Calendar.getInstance();
        fechaAltaCal.setTime(fechaAlta);
        int añosTrabajados = ahora.get(Calendar.YEAR) - fechaAltaCal.get(Calendar.YEAR);
        double aumento = sueldo * (porcentaje / 100.0) * añosTrabajados;
        sueldo += aumento;
    }

    // Método para obtener los datos del empleado.
    public String getDatosEmpleado(){
        return nombre + " desde " +fechaAlta+" cobra "+sueldo;
    }

    // Métodos getter y setter para los campos de la clase.
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Date getFechaAlta() { return fechaAlta; }
    public void setFechaAlta(int año, int mes, int dia) {
        GregorianCalendar calendar = new GregorianCalendar(año, mes - 1, dia);
        fechaAlta = calendar.getTime();
    }
    public Double getSueldo() { return sueldo; }
    public void setSueldo(Double sueldo) { this.sueldo = sueldo; }
}

// Clase jefatura que hereda de la clase empleado.
class jefatura extends empleado {
    private Double incentivo; // Incentivo del jefe.

    // Constructor de la clase jefatura.
    public jefatura(String nombre, int año, int mes, int dia, Double sueldo) {
        super(nombre, año, mes, dia, sueldo);
        this.incentivo = 0.0;
    }

    // Método para establecer el incentivo del jefe.
    public void setIncentivo(Double incentivo) {
        this.incentivo = incentivo;
    }

    // Método para obtener el sueldo del jefe, que incluye el incentivo.
    public Double getSueldo() {
        Double sueldoBase = super.getSueldo();
        return sueldoBase + incentivo;
    }

    // Método para obtener los datos del jefe, que incluyen el incentivo.
    @Override
    public String getDatosEmpleado(){
        return super.getDatosEmpleado() + " con un incentivo de " + incentivo;
    }
}

