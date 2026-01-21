public class Libros {
    private String titulo;
    private String autor;
    private String categoria;
    private String busqLibros[];
    private int cantidad;
    
    //Constructores

    public Libros() {
        this.titulo = "Default";
        this.autor = "Default";
        this.categoria = "Categoria";
        busqLibros = new String[100];

    }

    public Libros(String titulo, String autor, String categoria){
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        busqLibros = new String[100];
    }


    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String titulo) {
        this.autor = autor;
    }

    public void setCategoria(String titulo) {
        this.categoria = categoria;
    }

}
