import java.util.Scanner;

public class App {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        GestoraUsuarios gestoraUsuarios = new GestoraUsuarios();
        GestoraLibros gestoraLibros = new GestoraLibros();
        Biblioteca biblioteca = new Biblioteca(gestoraUsuarios, gestoraLibros);
        comUsuario mensajes = new comUsuario(biblioteca);
        Libros libro = new Libros("Hola", "hola", "Salud");

        gestoraLibros gestorLibro = new gestoraLibros();
        gestorLibro.anadirLibros(libro);
        Libros librodos = new Libros("un monstruo viene a verme", "Stephen King", "miedo");
        gestorLibro.anadirLibros(librodos);
        gestorLibro.mostrarLibros();
        gestorLibro.mostrarLibrosPorCategoria("miedo");
        
        gestorLibro.eliminarLibros("Hola");
        gestorLibro.mostrarLibros();

        Usuario admin = new Usuario(true);
        admin.setNombreUsuario("jose");
        admin.setContrasena("1234");
        gestoraUsuarios.anadirUsuarios(admin);
        mensajes.Login();
       
}

}
