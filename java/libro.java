/*
Imagina que estás creando una aplicación para una biblioteca. Cada libro en la biblioteca tiene un título, un autor y un número de páginas.
Además, la biblioteca quiere llevar un recuento del número total de libros que se han creado.

Aquí están tus tareas:

Crea una clase Libro con los siguientes campos:
titulo (String)
autor (String)
numPaginas (int)
numTotalLibros (int) - Este será un campo estático que incrementarás cada vez que se cree un nuevo libro.
Crea los siguientes métodos en la clase Libro:
Un constructor que acepte el título, el autor y el número de páginas como parámetros. Este constructor también debe incrementar numTotalLibros.
getTitulo, getAutor y getNumPaginas - Estos métodos deben devolver el título, el autor y el número de páginas del libro, respectivamente.
getNumTotalLibros - Este método debe ser estático y debe devolver el número total de libros.
En tu método main, crea algunos libros y muestra sus detalles y el número total de libros.
 */
public class libro {
    private String titulo;
    private String autor;
    private int NumPaginas;
    private static int NumTotalLibros;

    public libro(String titulo, String autor, int NumPaginas){
        this.titulo=titulo;
        this.autor=autor;
        this.NumPaginas=NumPaginas;
        NumTotalLibros++;
    }
    
    public String GetDatosLibro(){
        return "El titulo del libro es "+titulo+" del autor "+autor+ " tiene un total de "+NumPaginas+ ". En la biblioteca tenemos este número de libros "+NumTotalLibros;
    }
    public void SetTitulo(String titulo){
        this.titulo=titulo;
    }
    public String GetTitulo(){
        return titulo;
    }
}

