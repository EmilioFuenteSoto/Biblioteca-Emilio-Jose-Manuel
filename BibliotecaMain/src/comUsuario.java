import java.util.Scanner;

public class ComUsuario {
    private Biblioteca biblioteca;

    public ComUsuario(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

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

        Libros libro = new Libros(titulo, autor, categoria);
        boolean accion = biblioteca.anadirLibros(libro);

        if (accion) {
            System.out.println("El libro se ha añadido");
        } else {
            System.out.println("El libro no pudo añadirse");
        }

    }

    public void addUsuarios() {

        System.out.println("Has elegido la opcion 1 que es añadir libros sr Admin");
        System.out.println();

        System.out.println("Introduce tu usuario");
        String Usuario = sc.nextLine();

        System.out.println("Introduce tu contraseña");
        String contrasena = sc.nextLine();

        Usuario usuario = new Usuario(Usuario, contrasena);

        boolean accion = biblioteca.añadirUsuarios(usuario);

        if (accion) {
            System.out.println("El usuario se ha añadido");
        } else {
            System.out.println("El usuario no pudo añadirse");
        }

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

    public void mostrarTodosLibros() {
        System.out.println(biblioteca.mostrarLibros());
    }

    public void mostrarMenuAdmin(Usuario usuario) {
        boolean salida = true;

        while (salida) {
            System.out.println("=== MENU ADMIN ===");
            System.out.println("1. Ver Libros");
            System.out.println("2. Añadir Libro");
            System.out.println("3. Buscar por Autor");
            System.out.println("4. Buscar por Categoria");
            System.out.println("5. Buscar por Titulo");
            System.out.println("7. Añadir Usuarios");
            System.out.println("8. Salir del menú");

            int opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1 -> mostrarTodosLibros();
                case 2 -> addLibros();
                case 3 -> buscarPorAutor();
                case 4 -> buscarPorCtegoria();
                case 5 -> buscarPorTitulo();
                case 6 -> addUsuarios();
                case 7 -> salida = false;

            }
        }

    }

    public void buscarPorTitulo() {
        System.out.println("Introduce el titulo");
        String titulo = sc.nextLine();
        Libros[] encontrados = biblioteca.buscarLibroPorTitulo(titulo);

        if (encontrados.length != 0) {
            for (int i = 0; i < encontrados.length; i++) {
                System.out.println(encontrados[i]);
            }
        } else {
            System.out.println("No hay ningun libro asociado a este autor");

        }
    }

    public void buscarPorCtegoria() {
        System.out.println("Introduce la categoria");
        String categoria = sc.nextLine();
        Libros[] encontrados = biblioteca.buscarLibroPorCategoria(categoria);

        if (encontrados.length != 0) {
            for (int i = 0; i < encontrados.length; i++) {
                System.out.println(encontrados[i]);
            }
        } else {
            System.out.println("No hay libros en esta categoria");

        }
    }

    public void buscarPorAutor() {
        System.out.println("Introduce la categoria");
        String autor = sc.nextLine();
        Libros[] encontrados = biblioteca.buscarLibroPorCategoria(autor);

        if (encontrados.length != 0) {
            for (int i = 0; i < encontrados.length; i++) {
                System.out.println(encontrados[i]);
            }
        } else {
            System.out.println("No hay libros asociados a este autor");

        }
    }

}
