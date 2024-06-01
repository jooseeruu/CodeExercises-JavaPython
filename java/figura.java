public abstract class figura {
    protected double x;
    protected double y;


    public figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double calcular_area();
    public abstract String get_resultados();
}

