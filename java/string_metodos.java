public class string_metodos {
    public static void main(String[] args) {
        String mi_nombre="jooseeruu";
        int longitud=mi_nombre.length();
        for (int i = 0; i < mi_nombre.length(); i++) {
            System.out.println(mi_nombre.charAt(i));
        }
        System.out.println("Mi nombre tiene "+longitud+" letras");
    }
}
