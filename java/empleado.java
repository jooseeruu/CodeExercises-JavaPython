import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Clase empleado que representa a un empleado con su nombre, fecha de alta y sueldo.
 */
public class empleado {
    private String nombre; // Nombre del empleado
    private Date fechaAlta; // Fecha de alta del empleado
    private Double sueldo; // Sueldo del empleado

    /**
     * Constructor de la clase empleado.
     * @param nombre Nombre del empleado.
     * @param año Año de alta del empleado.
     * @param mes Mes de alta del empleado.
     * @param dia Día de alta del empleado.
     * @param sueldo Sueldo del empleado.
     */
    public empleado(String nombre, int año, int mes, int dia, Double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        GregorianCalendar calendar = new GregorianCalendar(año, mes - 1, dia);
        fechaAlta = calendar.getTime();
    }

    /**
     * Método para aumentar el sueldo del empleado basado en los años trabajados y un porcentaje.
     * @param porcentaje Porcentaje de aumento del sueldo.
     */
    public void subidaSueldo(double porcentaje) {
        Calendar ahora = Calendar.getInstance();
        Calendar fechaAltaCal = Calendar.getInstance();
        fechaAltaCal.setTime(fechaAlta);
        int añosTrabajados = ahora.get(Calendar.YEAR) - fechaAltaCal.get(Calendar.YEAR);
        double aumento = sueldo * (porcentaje / 100.0) * añosTrabajados;
        sueldo += aumento;
    }

    /**
     * Método para obtener los datos del empleado.
     * @return Una cadena con los datos del empleado.
     */
    public String getDatosEmpleado(){
        return nombre + " desde " +fechaAlta+" cobra "+sueldo;
    }

    /**
     * Método para obtener el nombre del empleado.
     * @return El nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del empleado.
     * @param nombre El nuevo nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener la fecha de alta del empleado.
     * @return La fecha de alta del empleado.
     */
    public Date getFechaAlta() {
        return fechaAlta;
    }

    /**
     * Método para establecer la fecha de alta del empleado.
     * @param año El nuevo año de alta del empleado.
     * @param mes El nuevo mes de alta del empleado.
     * @param dia El nuevo día de alta del empleado.
     */
    public void setFechaAlta(int año, int mes, int dia) {
        GregorianCalendar calendar = new GregorianCalendar(año, mes - 1, dia);
        fechaAlta = calendar.getTime();
    }

    /**
     * Método para obtener el sueldo del empleado.
     * @return El sueldo del empleado.
     */
    public Double getSueldo() {
        return sueldo;
    }

    /**
     * Método para establecer el sueldo del empleado.
     * @param sueldo El nuevo sueldo del empleado.
     */
    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
