import java.util.Arrays;

public class gestoraLibros {
    private int cantidad;
    private Libros[] libros_personas;
    private static final int MAX_LIBROS = 100;

    public gestoraLibros() {
        this.libros_personas = new Libros[MAX_LIBROS];
        this.cantidad = 0;
    }

    // Metodo cuya función se encarga de añadir libros nuevos
    public boolean anadirLibros(Libros libro) {
        if (cantidad < MAX_LIBROS) {
            libros_personas[cantidad] = libro;
            cantidad++;
            return true;
        }
        return false;

    }

    public Libros[] buscarPorTitulo(String titulo) {

        int pos = 0;
        Libros[] libros_encontrados_por_titulo = new Libros[cantidad];
        for (int i = 0; i < cantidad; i++) {
            if (libros_personas[i].getTitulo().equals(titulo)) {
                libros_encontrados_por_titulo[pos] = libros_personas[i];
                pos++;
            }

        }

        return Arrays.copyOf(libros_encontrados_por_titulo, pos);

    }

    public Libros[] buscarPorAutor(String autor) {

        int pos = 0;
        Libros[] libros_encontrados_por_autor = new Libros[cantidad];
        for (int i = 0; i < cantidad; i++) {
            if (libros_personas[i].getTitulo().equals(autor)) {
                libros_encontrados_por_autor[pos] = libros_personas[i];
                pos++;
            }

        }
        return Arrays.copyOf(libros_encontrados_por_autor, pos);
    }

    public Libros[] buscarPorCategoria(String categoria) {

        int pos = 0;
        Libros[] libros_encontrados_por_categoria = new Libros[cantidad];
        for (int i = 0; i < cantidad; i++) {
            if (libros_personas[i].getTitulo().equals(categoria)) {
                libros_encontrados_por_categoria[pos] = libros_personas[i];
                pos++;
            }

        }

        return Arrays.copyOf(libros_encontrados_por_categoria, pos);
    }

    public boolean eliminarLibros(String titulo) {
        boolean eliminado = false;
        for (int i = 0; i < cantidad; i++) {
            if (libros_personas[i].getTitulo().equals(titulo)) {
                for (int j = i; j < cantidad - 1; j++) {
                    libros_personas[j] = libros_personas[j + 1];
                }
                cantidad--;

                i--;

                eliminado = true;

            }

        }
        return eliminado;

    }

    public void mostrarLibros(){
        for(int i =0; i < cantidad; i++){
            System.out.println(libros_personas[i]);
        }
    }

    

}
