public class uso_libro{
    public static void main(String[] args){
        libro libro1=new libro("harry potado","yo mismo", 7);
        System.out.println(libro1.GetDatosLibro());
        libro1.SetTitulo("harry tortas");
        System.out.println(libro1.GetDatosLibro());
    }
}