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

    // Metodo que busca los libros por su titulo
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

    // Metodo que busca los libros por su autor
    public Libros[] buscarPorAutor(String autor) {

        int pos = 0;
        Libros[] libros_encontrados_por_autor = new Libros[cantidad];
        for (int i = 0; i < cantidad; i++) {
            if (libros_personas[i].getAutor().equals(autor)) {
                libros_encontrados_por_autor[pos] = libros_personas[i];
                pos++;
            }

        }
        return Arrays.copyOf(libros_encontrados_por_autor, pos);
    }

    // Busca los libros por su Categoria
    public Libros[] buscarPorCategoria(String categoria) {

        int pos = 0;
        Libros[] libros_encontrados_por_categoria = new Libros[cantidad];
        for (int i = 0; i < cantidad; i++) {
            if (libros_personas[i].getCategoria().equals(categoria)) {
                libros_encontrados_por_categoria[pos] = libros_personas[i];
                pos++;
            }

        }

        return Arrays.copyOf(libros_encontrados_por_categoria, pos);
    }

    // Metodo que elimina los libros
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

    @Override
    public String toString() {
        String infoLibros = "";
        for(int i =0; i < cantidad; i++){
            infoLibros+=libros_personas[i].toString();
        }
        return infoLibros;
    }

    // Metodo que muestra todos los libros disponibles
    public void mostrarLibros() {
     
        for (int i = 0; i < cantidad; i++) {
            toString();
        }
    }

    // Metodo que muestra todos los libros por su titulo
     public void mostrarLibrosPorTitulo(String titulo) {
        Libros[] encontrados = buscarPorCategoria(titulo);

        for (int i = 0; i < encontrados.length; i++) {
             System.out.println(encontrados);
        }

    }
     // Metodo que muestra todos los libros por su autor
     public void mostrarLibrosPorAutor(String autor) {
        Libros[] encontrados = buscarPorCategoria(autor);

        for (int i = 0; i < encontrados.length; i++) {
            encontrados.toString();
        }

    }

     // Metodo que muestra todos los libros por su categoria
    public void mostrarLibrosPorCategoria(String categoria) {
        Libros[] encontrados = buscarPorCategoria(categoria);

        for (int i = 0; i < encontrados.length; i++) {
            encontrados.toString();
        }

    }

}
