import java.util.Arrays;

public class GestoraLibros {
    private int cantidad;
    private Libros[] librosPersonas;
    private Libros[] prestamosLibros;
    private static final int MAX_LIBROS = 100;
    private int prestadoscantidad;

    public GestoraLibros() {
        this.librosPersonas = new Libros[MAX_LIBROS];
        this.prestamosLibros = new Libros[MAX_LIBROS];
        this.cantidad = 0;
        this.prestadoscantidad=0;
    }

    // Metodo cuya función se encarga de añadir libros nuevos
    public boolean anadirLibros(Libros libro) {
        if (cantidad < MAX_LIBROS) {
            librosPersonas[cantidad] = libro;
            cantidad++;
            return true;
        }
        return false;

    }

    // Metodo que busca los libros por su titulo
    public Libros[] buscarPorTitulo(String titulo) {

        int pos = 0;
        Libros[] librosEncontradosPorTitulo = new Libros[cantidad];
        for (int i = 0; i < cantidad; i++) {
            if (librosPersonas[i].getTitulo().equals(titulo)) {
                librosEncontradosPorTitulo[pos] = librosPersonas[i];
                pos++;
            }

        }

        return Arrays.copyOf(librosEncontradosPorTitulo, pos);

    }

    // Metodo que busca los libros por su autor
    public Libros[] buscarPorAutor(String autor) {

        int pos = 0;
        Libros[] libros_encontrados_por_autor = new Libros[cantidad];
        for (int i = 0; i < cantidad; i++) {
            if (librosPersonas[i].getAutor().equals(autor)) {
                libros_encontrados_por_autor[pos] = librosPersonas[i];
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
            if (librosPersonas[i].getCategoria().equals(categoria)) {
                libros_encontrados_por_categoria[pos] = librosPersonas[i];
                pos++;
            }

        }

        return Arrays.copyOf(libros_encontrados_por_categoria, pos);
    }

    // Metodo que elimina los libros
    public boolean eliminarLibros(String titulo) {
        boolean eliminado = false;
        for (int i = 0; i < cantidad; i++) {
            if (librosPersonas[i].getTitulo().equals(titulo)) {
                for (int j = i; j < cantidad - 1; j++) {
                    librosPersonas[j] = librosPersonas[j + 1];
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
            infoLibros+=librosPersonas[i].toString();
        }
        return infoLibros;
    }

    
    public boolean prestamoLibros(String titulo){
        boolean prestamo_exitoso = false;

        for(int i =0; i< cantidad; i++){
            if(librosPersonas[i].getTitulo().equals(titulo)){
               prestamosLibros[prestadoscantidad] = librosPersonas[i];
               prestadoscantidad++;
                eliminarLibros(titulo);
                return prestamo_exitoso = true;
            }

        }

        return prestamo_exitoso;
    }
    
    

    

}
