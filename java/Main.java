public class Main {
    private static final char[] letrasNIF = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public static void main(String[] args) {
        System.out.println(esNIFCorrecto(new char[]{'0','8','9','2','8','8','6','7','Z'})); // true
        System.out.println(esNIFCorrecto(new char[]{'0','0','0','0','0','0','2','4','R'})); // true
        System.out.println(esNIFCorrecto(new char[]{'0','0','0','0','0','0','2','4','B'})); // false
        System.out.println(esNIFCorrecto(new char[]{'0','3','4','9','5'})); // false
    }

    public static boolean esNIFCorrecto(char[] nif) {
        if (nif.length != 9) {
            return false;
        }
        int numeroNIF = Integer.parseInt(new String(nif, 0, 8));
        char letraCalculada = letraNIF(numeroNIF % 23);
        return nif[8] == letraCalculada;
    }

    public static char letraNIF(int indice) {
        return letrasNIF[indice];
    }
}
