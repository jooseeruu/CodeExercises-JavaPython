public class claseAbstracta {
    public static void main(String[] args) {
        figura cuadrado1= new cuadrado(2.0,0,0);
        figura circulo1=new circulo(3.14,13,0,0);
        System.out.println(cuadrado1.get_resultados());
        System.out.println(circulo1.get_resultados());
    }
}
