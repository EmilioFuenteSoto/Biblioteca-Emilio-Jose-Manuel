public class Libros {
    private String titulo;
    private String autor;
    private String categoria;
    
    
    //Constructores

    public Libros() {
        this.titulo = "Default";
        this.autor = "Default";
        this.categoria = "Categoria";
        
    }

    public Libros(String titulo, String autor, String categoria){
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        
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

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nombre del libro: " + getTitulo() + " Autor del libro: " + getAutor() + " Categoria del libro: " + getCategoria();
    }

}
