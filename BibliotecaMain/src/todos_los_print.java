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

    public void Login() {
        System.out.println("Introduce el nombre de usuario");
        String usuario = sc.nextLine();

        System.out.println("Introduce tu contraseña");
        String contrasena = sc.nextLine();

        boolean usuario2 = biblioteca.validacionUsuario(usuario, contrasena);

        if (!usuario2) {
            System.out.println("Introduce el usuario y la contraseña correcto");
        }

        Usuario usuarioReal = biblioteca.obtenerUsuario(usuario, contrasena);

        boolean esAdmin = biblioteca.validarAdmin(usuarioReal);

        if (esAdmin) {
            mostrarMenuAdmin(usuarioReal);
        }

    }

    public void mostrarMenuAdmin(Usuario usuario) {
        boolean salida = false;

        while (salida) {
            System.out.println("=== MENU ADMIN ===");
            System.out.println("1. Ver Libros");
            System.out.println("2. Añadir Libro");
            System.out.println("3. Eliminar Libro");
            System.out.println("4. Gestionar Usuarios");
            System.out.println("5. Salir");

            int opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1 -> addLibros();

            }
        }

    }

    public void buscarPorTitulo() {
        System.out.println("Introduce el titulo a buscar");
        String titulo = sc.nextLine();
        biblioteca.buscarLibroPorTitulo(titulo);
    }

    public void buscarPorCtegoria() {
        System.out.println("Introduce la categoria para encontrar todos los libros que pertenecen a esa categoria");
        String categoria = sc.nextLine();
        biblioteca.buscarLibroPorCategoria(categoria);
    }

    public void buscarPorAutor() {
        System.out.println("Introduce el nombre de un autor para encontrar todos los libros que ha escrito");
        String autor = sc.nextLine();
        biblioteca.buscarLibroPorTitulo(autor);
    }

  

}
