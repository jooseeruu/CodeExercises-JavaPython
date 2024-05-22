import java.util.*;
public class acceso_aplicacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String clave = "vb77";
        System.out.println("Introduce la contraseña:");
        String probar_clave= entrada.nextLine();
        while(clave.equals(probar_clave)==false){
            System.out.println("contraseña incorrecta prueba de nuevo:");
            probar_clave=entrada.nextLine();
        }
        System.out.println("Bienvenido capitán salami");
    }
}
