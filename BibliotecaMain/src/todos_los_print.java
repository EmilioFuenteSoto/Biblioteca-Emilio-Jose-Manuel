import java.util.Scanner;

public class todos_los_print {
    private Biblioteca biblioteca;
    private final static Scanner sc = new Scanner(System.in);

    public void addLibros() {

        System.out.println("Has elegido la opcion 1 que es añadir libros sr Admin");
        System.out.println();

        System.out.println("Introduce el titulo de un libro");
        String titulo = sc.nextLine();

        System.out.println("Introduce el autor del libro");
        String autor = sc.nextLine();

        System.out.println("Introduce la categoria del libro");
        String categoria = sc.nextLine();

        biblioteca.anadirLibros(titulo, autor, categoria);

    }

    public void buscarPorTitulo() {
        System.out.println("Introduce el titulo a buscar");
        String titulo = sc.nextLine();
        biblioteca.buscarLibroPorTitulo(titulo);
    }

}
