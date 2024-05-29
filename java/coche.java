public class coche {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;
    private String color;
    private int peso_total;
    private boolean asientos_cuero,climatizador;

    public String dime_datos_generales() {
        return "Coche con " + ruedas + " ruedas, de " + largo + " cm de largo y " + ancho + " cm de ancho. " +
               "El motor tiene una potencia de " + motor + " cc y el coche pesa " + peso + " kg. " +
               "El color del coche es " + color + ". " +
               (asientos_cuero ? "Tiene asientos de cuero. " : "Tiene asientos normales. ") +
               (climatizador ? "Tiene climatizador. " : "Tiene aire acondicionado. ") +
               "El peso total es " + peso_total + " kg.";
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
        return peso;
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

    public void configura_climatizador(String climatizador){//SETTERS modifica  el valor de las propiedades de los objetos
        if(climatizador=="si"){
            this.climatizador=true;
        }else{
            this.climatizador=false;
        }
    }
    public void configura_asientosCuero(String asientos_cuero){
        if(asientos_cuero=="si"){
            this.asientos_cuero=true;
        }else{
            this.asientos_cuero=false;
        }
    }
    public void establecer_color(String color){ 
        this.color=color;
    }


    public coche(){ //CONSTRUCTOR CLASE COCHE
        ruedas=4;
        largo=2000;
        ancho=300;
        motor=1800;
        peso=500;
    }
}
