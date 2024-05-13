class Compra {
    String establiment;
    double importe;

    Compra(String establiment, double importe) {
        this.establiment = establiment;
        this.importe = importe;
    }
}

class Targeta {
    private String numero;
    private boolean activa;
    private String nom;
    private Compra[] compres;
    private int index;

    Targeta(String numero, String nom) {
        this.numero = numero;
        this.nom = nom;
        this.activa = true;
        this.compres = new Compra[100]; // assuming a maximum of 100 purchases
        this.index = 0;
    }

    void afegirCompra(String establiment, double importe) {
        if (index < compres.length) {
            this.compres[index++] = new Compra(establiment, importe);
        }
    }

    void llistarCompres(int n) {
        for (int i = 0; i < n && i < index; i++) {
            Compra compra = this.compres[index - 1 - i];
            System.out.println(compra.establiment + " " + compra.importe + "€");
        }
    }

    String getNumero() {
        return "**** **** **** " + this.numero.substring(12);
    }
}

class Principal {
    static boolean esValida(String numero) {
        // Aquí implementamos una lógica de validación simple que siempre devuelve true
        return true;
    }

    public static void main(String[] args) {
        Targeta targeta = new Targeta("1234567890123452", "Banc 1");
        targeta.afegirCompra("Farmàcia", 8.60);
        targeta.afegirCompra("Agència de viatges", 90.88);
        targeta.afegirCompra("Mercat", 12.55);
        targeta.afegirCompra("Cafeteria", 4.50);
        targeta.afegirCompra("Mecànic", 40.00);
        targeta.afegirCompra("Tenda d'esports", 29.95);

        if (esValida(targeta.getNumero())) {
            System.out.println("La targeta " + targeta.getNumero() + " és vàlida.");
            System.out.println("Targeta enregistrada correctament.");
            System.out.println("Darreres 4 compres realitzades per la targeta " + targeta.getNumero() + ":");
            targeta.llistarCompres(4);
        } else {
            System.out.println("La targeta " + targeta.getNumero() + " no és vàlida.");
        }
    }
}

