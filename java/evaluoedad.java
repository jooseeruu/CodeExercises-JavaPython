import java.util.*;
public class evaluoedad {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad=entrada.nextInt();
        if (edad>=18) {
            System.out.println("Eres grandote");
        }
        else if(edad>=0 && edad<=10){
            System.out.println("vas al cole");
        }
        else{
            System.out.println("es imposible que seas menor de 0 años myg");
        }
    }
}
