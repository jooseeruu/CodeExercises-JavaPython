public class coche {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;
    String color;
    int peso_total;
    boolean asientos_cuero,climatizador;


    public int dime_largo(){ //GETTERS devuelve el valor de las propiedades de los objetos
        return largo;
    }
    public int dime_ruedas(){
        return ruedas;
    }
    public int dime_ancho(){
        return ancho;
    }
    public int dime_motor(){
        return motor;
    }
    public int dime_peso(){
        return peso;
    }
    public String dime_color(){
        return color;
    }

    public void establecer_color(){ //SETTERS modifica  el valor de las propiedades de los objetos
        color="azul";
    }


    public coche(){ //CONSTRUCTOR CLASE COCHE
        ruedas=4;
        largo=2000;
        ancho=300;
        motor=1800;
        peso=500;
    }
}
