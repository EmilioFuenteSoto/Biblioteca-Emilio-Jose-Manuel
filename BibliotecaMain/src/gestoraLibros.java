public class gestoraLibros {
    private int cantidad;
    private Libros busqLibros[];

    public gestoraLibros() {
        busqLibros = new Libros[100];
        cantidad = 0;
    }

    // Metodo cuya función se encarga de añadir libros nuevos
    public void anadirLibros(Libros libros) {
        busqLibros[cantidad] = libros;
        cantidad++;
    }



}
