
import java.util.Scanner;

public class adivina_numero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero_adivinar= (int) (Math.random()*20+1);
        System.out.println("Introduce un número del 1 al 20 para intentar adivinar");
        int intentos = 1;
        int numero_propuesta=entrada.nextInt();
        while(numero_adivinar!=numero_propuesta){
            if (numero_adivinar>numero_propuesta){
                System.out.println("Es un número más alto");
            }
            else if(numero_adivinar<numero_propuesta){
                System.out.println("Es un número más bajo");
            }
            System.out.println("Has Fallado vuelve a introducir un número del 1 al 20 para intentar adivinar");
            intentos+=1;
            numero_propuesta=entrada.nextInt();
        }
        System.out.println("Felicidades has acertado en "+ intentos +" intentos"+" como ya sabes el número era este "+ numero_adivinar);    
    }
}
