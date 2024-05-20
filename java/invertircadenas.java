public class invertircadenas {
    public static void main(String[] args) {
        System.out.println(invertirCadenas("amor"));
    }

    public static String invertirCadenas(String palabra){
        char[] arrayPalabra = palabra.toCharArray();
        String palabraInvertida = "";
        for (int i = arrayPalabra.length - 1; i >= 0; i--) {
            palabraInvertida += arrayPalabra[i];
        }
        return palabraInvertida;
    }
}
