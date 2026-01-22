public class App {
    public static void main(String[] args) throws Exception {
        Libros libro = new Libros("Hola", "hola", "Salud");

        gestoraLibros gestor = new gestoraLibros();
        gestor.anadirLibros(libro);
        Libros librodos = new Libros("un monstruo viene a verme", "Stephen King", "miedo");
        gestor.anadirLibros(librodos);
        gestor.mostrarLibros();
        gestor.mostrarLibrosPorCategoria("miedo");
        
        gestor.eliminarLibros("Hola");
        gestor.mostrarLibros();
    }
}
