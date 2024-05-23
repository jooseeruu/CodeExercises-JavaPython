
import java.util.Scanner;

public class array_foreach {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        String [] array_paises=new String[8];

        for (int i=0; i<array_paises.length; i++){
            System.out.println("Introduce un País:");
            array_paises[i]=entrada.nextLine();
        }
        for (String elemento:array_paises){
            System.out.println(elemento);
        }
    }
}
