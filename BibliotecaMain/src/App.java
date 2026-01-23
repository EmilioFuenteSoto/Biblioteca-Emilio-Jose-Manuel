import java.util.Scanner;

public class App {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Libros libro = new Libros("Hola", "hola", "Salud");

        gestoraLibros gestor = new gestoraLibros();
        gestor.anadirLibros(libro);
        Libros librodos = new Libros("un monstruo viene a verme", "Stephen King", "miedo");
        gestor.anadirLibros(librodos);
        gestor.mostrarLibros();
        gestor.mostrarLibrosPorCategoria("miedo");

        // gestor.eliminarLibros("Hola");
        gestor.mostrarLibros();

        librodos.toString();

        Usuario usuario1 = new Usuario(true);

        Usuario usuario2 = new Usuario();

        // while (usuario2.getNombreUsuario().equals("none")) {

        // if(usuario1,admin){

        Biblioteca biblioteca = new Biblioteca();

        todos_los_print mensajes = new todos_los_print();

        gestora_usuarios usuarios_admin = new gestora_usuarios();

        boolean salida = false;
        int opcion = 0;

        while (salida) {

            usuarios_admin.comprobar_Existencia_Usuario(usuario2);

        }

    }
}
