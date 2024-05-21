import java.util.Scanner;

public class figuras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige una opción: cuadrado[1] , rectangulo[2], triangulo[3]");
        int figura = entrada.nextInt();
        switch(figura){
            case 1:
                System.out.println("Introduce el lado del cuadrado");
                int lado = entrada.nextInt();
                int resultado = lado*lado;
                System.out.println(resultado);
                break;
            case 2:
                System.out.println("Introduce el lado del rectangulo");
                int lado_rec = entrada.nextInt();
                int resultado_rec = lado_rec*lado_rec;
                System.out.println(resultado_rec);
                break;
            case 3:
                System.out.println("Introduce la altura del triangulo");
                int altura=entrada.nextInt();
                System.out.println("Introduce la base del triangulo");
                int base=entrada.nextInt();
                int resultado_tri = (base*altura)/2;
                System.out.println(resultado_tri);

        }
    }
}


