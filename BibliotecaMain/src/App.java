import java.util.Scanner;
/*
* @Author Emilio de la Fuente Soto y José Manuel Cano González 
 */
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
        Usuario noAdmin = new Usuario("emi", "emi", false);
        biblioteca.anadirUsuarios(admin);
        biblioteca.anadirUsuarios(noAdmin);

        Libros libro1 = new Libros("Harry Potter", "J K Rowling", "Misterio");
        Libros libro2 = new Libros("Nacidos de la Bruma", "Brandon Sanderson", "Fantasia");
        Libros libro3 = new Libros("IT", "Stephen King", "Miedo");
        Libros libro4 = new Libros("Los Cuentos de Terramar", "Ursula K LeGuin", "Fantasia");
        
        biblioteca.anadirLibros(libro3);
        biblioteca.anadirLibros(libro2);
        biblioteca.anadirLibros(libro1);
        biblioteca.anadirLibros(libro4);

        
        


        comUsuarios.login();

    }

}
