
import java.util.Scanner;

public class comprobante_email {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String mail="";
        System.out.println("Introduce tu mail:");
        mail=entrada.nextLine();
        boolean arroba= false;
        
        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i)=='@'){
                arroba=true;
            }
        }
        if(arroba==true){
            System.out.println("correcto");
        }
        else{
            System.out.println("incorrecto");
        }
    }
}
