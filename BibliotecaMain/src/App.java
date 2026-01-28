import java.util.Scanner;

public class App {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        GestoraUsuarios gestoraUsuarios = new GestoraUsuarios();
        GestoraLibros gestoraLibros = new GestoraLibros();
        Biblioteca biblioteca = new Biblioteca(gestoraUsuarios, gestoraLibros);
        ComUsuario comUsuarios = new ComUsuario(biblioteca);
        Usuario admin = new Usuario(true);
        admin.setNombreUsuario("jose");
        admin.setContrasena("1234");
        biblioteca.anadirUsuarios(admin);

        Libros libro1 = new Libros("Harry Potter", "J K Rowling", "Misterio");
        Libros libro2 = new Libros("Imperio Final", "Brandon Sanderson", "Fantasía");
        Libros libro3 = new Libros("IT", "Stephen King", "Miedo");

        biblioteca.anadirLibros(libro3);
        biblioteca.anadirLibros(libro2);
        biblioteca.anadirLibros(libro1);

        Usuario usuario1 = new Usuario("emi", "emi", false);
        biblioteca.anadirUsuarios(usuario1);

        Libros libro1 = new Libros("un monstruo viene verme", "stphen king", "miedo");

        biblioteca.anadirLibros(libro1);


        comUsuarios.login();

    }

}
