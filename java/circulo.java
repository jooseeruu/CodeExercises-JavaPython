public class circulo extends figura {
    private double PI;
    private double Radio;
    public circulo(double PI,double Radio,double x, double y){
        super(x, y);
        this.PI=PI;
        this.Radio=Radio;
    }

    @Override
    public double calcular_area() {
        double resultado= PI*Radio*Radio;
        return resultado;
    }
    public String get_resultados(){
        return "resultado "+ calcular_area();
    }
    
}
