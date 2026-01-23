public class Biblioteca {
    private gestoraLibros gestoraLibros;

    public Biblioteca() {

    }

    public void anadirLibros(String titulo, String categoria, String Autor) {
        Libros libro = new Libros(titulo, Autor, categoria);
    }

    public void buscarLibroPorTitulo(String titulo){
        gestoraLibros.buscarPorTitulo(titulo);
    }

}