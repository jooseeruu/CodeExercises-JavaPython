
import java.util.Scanner;

public class comprobante_email {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String mail="";
        System.out.println("Introduce tu mail:");
        mail=entrada.nextLine();
        int arroba= 0;
        boolean punto = false;
        
        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i)=='@'){
                arroba++;
            }
            if (mail.charAt(i)=='.'){
                punto=true;
            }
        }
        if(arroba==1 && punto==true ){
            System.out.println("correcto");
        }
        else{
            System.out.println("incorrecto");
        }
    }
}
