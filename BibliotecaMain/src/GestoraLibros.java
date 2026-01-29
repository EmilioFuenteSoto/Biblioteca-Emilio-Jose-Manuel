import java.util.Arrays;
/*
* @Author Emilio de la Fuente Soto y José Manuel Cano González 
 */
public class GestoraLibros {
    private int cantidad;
    private Libros[] librosDePersonas;
    private Libros[] librosPrestados;
    private static final int MAX_LIBROS = 100;
    private int prestadosCantidad;

    public GestoraLibros() {
        this.librosDePersonas = new Libros[MAX_LIBROS];
        this.librosPrestados = new Libros[MAX_LIBROS];
        this.cantidad = 0;
        this.prestadosCantidad = 0;
    }

    // Metodo cuya función se encarga de añadir libros nuevos
    public boolean anadirLibros(Libros libro) {
        if (cantidad < MAX_LIBROS) {
            librosDePersonas[cantidad] = libro;
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
            if (librosDePersonas[i].getTitulo().toLowerCase().equals(titulo.toLowerCase())) {
                librosEncontradosPorTitulo[pos] = librosDePersonas[i];
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
            if (librosDePersonas[i].getAutor().toLowerCase().equals(autor.toLowerCase())) {
                libros_encontrados_por_autor[pos] = librosDePersonas[i];
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
            if (librosDePersonas[i].getCategoria().toLowerCase().equals(categoria.toLowerCase())) {
                libros_encontrados_por_categoria[pos] = librosDePersonas[i];
                pos++;
            }

        }

        return Arrays.copyOf(libros_encontrados_por_categoria, pos);
    }

    // Metodo que elimina los libros
    public boolean eliminarLibros(String titulo) {
        boolean eliminado = false;
        for (int i = 0; i < cantidad; i++) {
            if (librosDePersonas[i].getTitulo().toLowerCase().equals(titulo.toLowerCase())) {
                for (int j = i; j < cantidad - 1; j++) {
                    librosDePersonas[j] = librosDePersonas[j + 1];
                }
                cantidad--;

                i--;

                eliminado = true;

            }

        }
        return eliminado;

    }

    public boolean eliminarLibrosPrestados(String titulo) {
        boolean eliminado = false;
        for (int i = 0; i < prestadosCantidad; i++) {
            if (librosPrestados[i].getTitulo().toLowerCase().equals(titulo.toLowerCase())) {
                for (int j = i; j < prestadosCantidad - 1; j++) {
                    librosPrestados[j] = librosPrestados[j + 1];
                }
                prestadosCantidad--;

                i--;

                eliminado = true;

            }

        }
        return eliminado;

    }

    @Override
    public String toString() {
        String infoLibros = "";
        for (int i = 0; i < cantidad; i++) {
            infoLibros += librosDePersonas[i].toString();
            infoLibros += "\n";
        }
        return infoLibros;
    }

    public Libros[] mostrarLibrosConMasPrestamos(){
        Libros[] libros = new Libros[MAX_LIBROS];
        int maximo = 0;
        for (int i = 0; i < cantidad; i++) {
            if(librosDePersonas[i].getVecesPrestado()>maximo)
            maximo = librosDePersonas[i].getVecesPrestado();
        }
        int cont = -1;
        for (int i = 0; i < cantidad; i++) {
            if(librosDePersonas[i].getVecesPrestado() == maximo){
                cont++;
                libros[cont] = librosDePersonas[i];
            }
        }

        Libros[] arrayLibrosTamanoAjustado = Arrays.copyOf(libros, cont+1);

        return arrayLibrosTamanoAjustado;
    } 

    public String mostrarLibrosPrestados() {
        String infoLibros = "";
        for (int i = 0; i < prestadosCantidad; i++) {
            infoLibros += librosPrestados[i].toString();
            infoLibros += "\n";
        }
        return infoLibros;
    }

    public boolean prestamoLibros(String titulo, Usuario usuario) {
        boolean prestamoExitoso = false;
        for (int i = 0; i < cantidad; i++) {
            if (librosDePersonas[i].getTitulo().toLowerCase().equals(titulo.toLowerCase())) {
                librosPrestados[prestadosCantidad] = librosDePersonas[i];
                prestadosCantidad++;
                librosDePersonas[i].setVecesPrestado(librosDePersonas[i].getVecesPrestado() + 1); 
                eliminarLibros(titulo);
                return prestamoExitoso = true;
            }

        }

        return prestamoExitoso;
    }

    public boolean devolverLibroPrestado(String titulo) {
        boolean prestamoExitoso = false;

        for (int i = 0; i < prestadosCantidad; i++) {
            if (librosPrestados[i].getTitulo().toLowerCase().equals(titulo.toLowerCase())) {
                librosDePersonas[cantidad] = librosPrestados[i];
                cantidad++;
                eliminarLibrosPrestados(titulo);
                return prestamoExitoso = true;
            }

        }

        return prestamoExitoso;
    }

    

}
