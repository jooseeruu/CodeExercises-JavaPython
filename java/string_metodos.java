public class string_metodos {
    public static void main(String[] args) {
        String mi_nombre="jooseeruu";
        int longitud=mi_nombre.length();
        for (int i = 0; i < mi_nombre.length(); i++) {
            System.out.println(mi_nombre.charAt(i));
        }
        System.out.println("Mi nombre tiene "+longitud+" letras");
        String mi_nombre_resumido= mi_nombre.substring(6,9);
        System.out.println(mi_nombre_resumido);

        String nombre1, nombre2;
        nombre1="albiño";
        nombre2="Albiño"; 
        boolean check=nombre1.equals(nombre2);
        boolean check_2=nombre1.equalsIgnoreCase(nombre2);
        System.err.println(check_2);
        String check_definitivo;
        if (check == true) {
            check_definitivo=Boolean.toString(check);
            check_definitivo=check_definitivo + "!";
        } else {
            check_definitivo=Boolean.toString(check);
            check_definitivo=check_definitivo + ":(";
        }

        System.out.println(check_definitivo);
    }
}
