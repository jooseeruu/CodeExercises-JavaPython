public class coche {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero,climatizador;

    public coche(){ //CONSTRUCTOR CLASE COCHE
        ruedas=4;
        largo=2000;
        ancho=300;
        motor=1800;
        peso_plataforma=500;
    }
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
        return peso_plataforma;
    }
    public String dime_color(){
        return color;
    }
    public String dime_asientosCuero(){
        if (asientos_cuero==true){
            return "El coche lleva asientos de cuero";
        }else{
            return "El coche lleva asientos normales";
        }
    }
    public String dime_climatizador(){
        if (climatizador==true){
            return "El coche lleva climatizador";
        }else{
            return "El coche lleva aire acondicionado";
        }
    }
    public String dime_peso_total(){ //setter+getter
        int peso_carroceria = 500;
        peso_total=peso_plataforma+peso_carroceria;
        if(asientos_cuero==true){
            peso_total+=50;
        }
        if(climatizador==true){
            peso_total+=20;
        }
        return "El peso del coche es "+ peso_total+" kg";
    }
    public void configura_climatizador(String climatizador) { //SETTERS modifica el valor de las propiedades de los objetos
        if (climatizador.equals("si")) {
            this.climatizador = true;
        } else {
            this.climatizador = false;
        }
    }
    
    public void configura_asientosCuero(String asientos_cuero) {
        if (asientos_cuero.equals("si")) {
            this.asientos_cuero = true;
        } else {
            this.asientos_cuero = false;
        }
    }
    
    public void establecer_color(String color){ 
        this.color=color;
    }




    public String dime_datos_generales() {
        return "Coche con " + ruedas + " ruedas, de " + largo + " cm de largo y " + ancho + " cm de ancho. " +
                "El motor tiene una potencia de " + motor + " cc y el peso de la plataforma es " + peso_plataforma + " kg.";
    }
    
    
}
