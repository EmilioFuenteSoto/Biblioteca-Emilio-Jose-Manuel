import java.util.Scanner;

public class App {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        GestoraUsuarios gestoraUsuarios = new GestoraUsuarios();
        GestoraLibros gestoraLibros = new GestoraLibros();
        Biblioteca biblioteca = new Biblioteca(gestoraUsuarios, gestoraLibros);
        comUsuario mensajes = new comUsuario(biblioteca);
        Usuario admin = new Usuario(true);
        admin.setNombreUsuario("jose");
        admin.setContrasena("1234");
        gestoraUsuarios.anadirUsuarios(admin);
        mensajes.Login();
       
}

}
