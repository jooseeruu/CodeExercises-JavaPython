/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */
public class anagrama {

    public static boolean esAnagrama(String palabra1, String palabra2) {
        if (palabra1.equals(palabra2)) {
            return false;
        }

        char[] arrayPalabra1 = palabra1.toCharArray();
        char[] arrayPalabra2 = palabra2.toCharArray();

        java.util.Arrays.sort(arrayPalabra1);
        java.util.Arrays.sort(arrayPalabra2);

        return java.util.Arrays.equals(arrayPalabra1, arrayPalabra2);
    }

    public static void main(String[] args) {
        System.out.println(esAnagrama("amor", "roma"));
        System.out.println(esAnagrama("hola", "aloh"));
        System.out.println(esAnagrama("hola", "hola"));
        System.out.println(esAnagrama("hola", "adios")); 
    }
}


