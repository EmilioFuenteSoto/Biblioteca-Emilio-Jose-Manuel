public class App {
    public static void main(String[] args) throws Exception {
        Libros libro = new Libros("Hola", "hola", "Salud");

        gestoraLibros gestorLibro = new gestoraLibros();
        gestorLibro.anadirLibros(libro);
        Libros librodos = new Libros("un monstruo viene a verme", "Stephen King", "miedo");
        gestorLibro.anadirLibros(librodos);
        gestorLibro.mostrarLibros();
        gestorLibro.mostrarLibrosPorCategoria("miedo");
        
        gestorLibro.eliminarLibros("Hola");
        gestorLibro.mostrarLibros();

        Usuario usuario1 = new Usuario(true);

        Usuario usuario2 = new Usuario();

       // while (usuario2.getNombreUsuario().equals("none")) {

            //if(usuario1,admin){

            

            
        
    }
}
