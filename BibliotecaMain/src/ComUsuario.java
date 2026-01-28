import java.util.Scanner;

public class ComUsuario {
    private Biblioteca biblioteca;
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_GREY = "\u001B[90m";
    private static final String ANSI_WHITE = "\u001B[37m";
    private static final String[] colores = { ANSI_BLACK, ANSI_CYAN, ANSI_BLUE, ANSI_YELLOW, ANSI_GREEN, ANSI_PURPLE,
            ANSI_RED, ANSI_GREY };

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

    public void addLibrosPrestados() {
        System.out.println("Elige el libro que quieres prestar");

        String libros = sc.nextLine();

        boolean anadir_Libros = biblioteca.anadirLibrosPrestados(libros);

        if (anadir_Libros) {
            System.out.println("Se te ha prestado el libro correctamente");
        } else {
            System.out.println("No se ha hecho el prestamo del libro correctamente");
        }
    }

    public void addUsuarios(int i) {

        System.out.println("Introduce un nuevo nombre de usuario");
        String Usuario = sc.nextLine();

        System.out.println("Introduce una nueva contraseña");
        String contrasena = sc.nextLine();
        Usuario usuario;

        if (i == 1) {
            usuario = new Usuario(Usuario, contrasena, false);
        } else {
            usuario = new Usuario(Usuario, contrasena, true);
        }

        boolean accion = biblioteca.anadirUsuarios(usuario);

        if (accion) {
            System.out.println("El usuario se ha añadido");
        } else {
            System.out.println("El usuario no pudo añadirse");
        }

    }

    public void login() {
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
        } else {
            mostrarMenuUsuario(usuarioReal);
        }

    }

    public void mostrarTodosLibros() {
        System.out.println(biblioteca.mostrarLibros());
    }

    public void mostrarTodosLibrosPrestados() {
        System.out.println(biblioteca.mostrarLibrosPrestados());
    }

    public void mostrarTodosUsuarios() {
        System.out.println(biblioteca.mostrarUsuarios());
    }

    public void eliminarLibros() {
        System.out.println("Introduce el título del libro a borrar");
        String titulo = sc.nextLine();
        if (biblioteca.eliminarLibros(titulo)) {
            System.out.println("Libro " + titulo + " eliminado correctamente");
        } else {
            System.out.println("No se pudo borrar " + titulo);
        }

    }

    public void devolverLibrosPrestados() {
        System.out.println("Introduce el titulo del libro que quieres devolver");
        String titulo = sc.nextLine();

        if (biblioteca.devolverLibrosPres(titulo)) {
            System.out.println("Libro devueltamente correctamente a la biblioteca");
        } else {
            System.out.println("No existe el libro que quieres devolver");
        }
    }

    public void mostrarMenuAdmin(Usuario usuario) {
        boolean salida = true;

        while (salida) {
            System.out.println("=== OPCIONES USUARIO NORMAL ===");
            System.out.println(ANSI_BLUE + "1. Mostrar Libros" + ANSI_WHITE);
            System.out.println(ANSI_BLUE + "2. Buscar por Autor" + ANSI_WHITE);
            System.out.println(ANSI_BLUE + "3. Buscar por Categoria"+ ANSI_WHITE);
            System.out.println(ANSI_BLUE + "4. Buscar por Titulo"+ ANSI_WHITE);
            System.out.println( ANSI_BLUE + "5. Realizar el prestamo de un libro" + ANSI_WHITE);
            System.out.println(ANSI_BLUE + "6. Devolver un libro a la biblioteca" + ANSI_WHITE);
            System.out.println();
            System.out.println("== OPCIONES ADMIN ==");
            System.out.println(ANSI_RED + "7. Añadir Libro" + ANSI_WHITE);
            System.out.println(ANSI_RED +"8. Añadir Usuarios"+ ANSI_WHITE);
            System.out.println(ANSI_RED +"9. Añadir Admin"+ ANSI_WHITE);
            System.out.println(ANSI_RED +"10. Mostrar Usuarios"+ ANSI_WHITE);
            System.out.println(ANSI_RED +"11. Eliminar Libro"+ ANSI_WHITE);
             System.out.println(ANSI_RED +"12. Mostrar los libros prestados"+ ANSI_WHITE);
            System.out.println(ANSI_RED +"13. Salir"+ ANSI_WHITE);

            int opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1 -> mostrarTodosLibros();
                case 2 -> buscarPorAutor();
                case 3 -> buscarPorCtegoria();
                case 4 -> buscarPorTitulo();
                case 5 -> addLibrosPrestados();
                case 6 -> devolverLibrosPrestados();

                case 7 -> addLibros();
                case 8 -> addUsuarios(1);
                case 9 -> addUsuarios(2);
                case 10 -> mostrarTodosUsuarios();
                case 11 -> eliminarLibros();
                case 12 -> mostrarTodosLibrosPrestados();
                case 13 -> salida = false;
            }
        }

    }

    public void mostrarMenuUsuario(Usuario usuario) {
        boolean salida = true;

        while (salida) {
            System.out.println("=== MENU USUARIO ===");
            System.out.println(ANSI_CYAN + "1. Mostrar Libros " + ANSI_WHITE);
            System.out.println(ANSI_CYAN + "2. Buscar por Autor" + ANSI_WHITE);
            System.out.println(ANSI_CYAN + "3. Buscar por Categoria" + ANSI_WHITE);
            System.out.println(ANSI_CYAN + "4. Buscar por Titulo" + ANSI_WHITE);
            System.out.println(ANSI_CYAN + "5. Realizar el prestamo de un libro" + ANSI_WHITE);
            System.out.println(ANSI_CYAN + "6. Devolver un libro a la biblioteca" + ANSI_WHITE);
            System.out.println(ANSI_CYAN + "7. Salir" + ANSI_WHITE);

            int opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1 -> mostrarTodosLibros();
                case 2 -> buscarPorAutor();
                case 3 -> buscarPorCtegoria();
                case 4 -> buscarPorTitulo();
                case 5 -> addLibrosPrestados();
                case 6 -> devolverLibrosPrestados();
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
