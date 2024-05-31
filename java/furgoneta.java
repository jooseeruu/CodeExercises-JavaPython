public class furgoneta extends coche {
    private int capacidad_carga;
    private int plazas_extra;

    public furgoneta(int plazas_extra, int capacidad_carga){
        super(); //llama a constructor de la clase padre osea coche con el objetivo de darle un estado inicial a furgoneta
        this.capacidad_carga=capacidad_carga;
        this.plazas_extra=plazas_extra;
    }

    public String getDatosFurgoneta(){
        return "La furgoneta tiene una capacidad de carga de "+capacidad_carga+" y tiene "+plazas_extra+" plazas extra.";
    }
}
