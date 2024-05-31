public class uso_Vehiculo {

    public static void main(String[] args) {

        // Crear un objeto coche INSTANCIAR UNA CLASE O EJEMPLARIZARLA
        coche miCoche = new coche();

        // Imprimir los datos generales del coche
        System.out.println(miCoche.dime_datos_generales());

        // Configurar y obtener el color del coche
        miCoche.establecer_color("Rojo");
        System.out.println("El color del coche es: " + miCoche.dime_color());

        // Configurar y obtener el tipo de asientos
        miCoche.configura_asientosCuero("si");
        System.out.println(miCoche.dime_asientosCuero());

        // Configurar y obtener el tipo de climatizador
        miCoche.configura_climatizador("si");
        System.out.println(miCoche.dime_climatizador());

        // Configurar y obtener el peso total
        miCoche.dime_peso_total();
        System.out.println("El peso total del coche es: " + miCoche.dime_peso_total());

        furgoneta miFurgoneta=new furgoneta(4,580);
        miFurgoneta.establecer_color("verde");
        miFurgoneta.configura_asientosCuero("si");
        miFurgoneta.configura_climatizador("si");
        System.out.println(miFurgoneta.dime_datos_generales()+miFurgoneta.getDatosFurgoneta());

    }
}


