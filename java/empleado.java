import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class empleado {
    private String nombre;
    private Date fechaAlta;
    private Double sueldo;

    public empleado(String nombre, int año, int mes, int dia, Double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        GregorianCalendar calendar = new GregorianCalendar(año, mes - 1, dia);
        fechaAlta = calendar.getTime();
    }

    public void subidaSueldo(double porcentaje) {
        Calendar ahora = Calendar.getInstance();
        Calendar fechaAltaCal = Calendar.getInstance();
        fechaAltaCal.setTime(fechaAlta);
        int añosTrabajados = ahora.get(Calendar.YEAR) - fechaAltaCal.get(Calendar.YEAR);
        double aumento = sueldo * (porcentaje / 100.0) * añosTrabajados;
        sueldo += aumento;
    }
    public String getDatosEmpleado(){
        return nombre + " desde " +fechaAlta+" cobra "+sueldo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(int año, int mes, int dia) {
        GregorianCalendar calendar = new GregorianCalendar(año, mes - 1, dia);
        fechaAlta = calendar.getTime();
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
}
