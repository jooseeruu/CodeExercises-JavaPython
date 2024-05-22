
import java.util.Scanner;

public class peso_ideal {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        String genero = "";
        double altura= 0;
        double peso=0;
        do { 
            System.out.println("Introduce [M] para mujer o [H] para hombre");
            genero=entrada.nextLine();
        } while (genero.equalsIgnoreCase("M")==false && genero.equalsIgnoreCase("H")==false);

        if(genero.equalsIgnoreCase("M")){
            System.out.println("Introduce tu altura en cm");
            altura=entrada.nextDouble();
            System.out.println("Introduce tu Peso");
            peso=entrada.nextDouble();
            double peso_ideal_mujer=0.675*altura-56.25;
            System.out.println("Tu peso ideal sería: "+peso_ideal_mujer);
            if(peso_ideal_mujer<peso){
                System.out.println("Ponte las pilas te sobran kilos, pesas"+peso+"kg"+"y tu peso ideal sería"+peso_ideal_mujer+"kg"+"tienes que bajar"+(peso-peso_ideal_mujer));
            }else{
            System.out.println("Ponte las pilas hay que comer más, pesas"+peso+"kg"+"y tu peso ideal sería"+peso_ideal_mujer+"kg"+"tienes que subir"+(peso_ideal_mujer-peso));}
        }
        else if(genero.equalsIgnoreCase("H")){
            System.out.println("Introduce tu altura en cm");
            altura=entrada.nextDouble();
            System.out.println("Introduce tu Peso");
            peso=entrada.nextDouble();
            double peso_ideal_hombre=0.75*altura-62.5;
            if(peso_ideal_hombre<peso){
                System.out.println("Ponte las pilas te sobran kilos, pesas"+peso+"kg"+"y tu peso ideal sería"+peso_ideal_hombre+"kg"+"tienes que bajar"+(peso-peso_ideal_hombre));
            }else{
            System.out.println("Ponte las pilas hay que comer más, pesas"+peso+"kg"+"y tu peso ideal sería"+peso_ideal_hombre+"kg"+"tienes que subir"+(peso_ideal_hombre-peso));}
        }
    }
}
