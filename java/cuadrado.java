public class cuadrado extends figura {
    private double lado;
    public cuadrado(double lado,double x, double y){
        super(x,y);
        this.lado=lado;
    }
    @Override
    public double calcular_area(){
        double resultado=lado*lado;
        return resultado;
    }
    public String get_resultados(){
        return "resultado "+ calcular_area();
    }
}

