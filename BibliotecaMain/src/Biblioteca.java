public class Biblioteca {
    private GestoraLibros gestoraLibros;
    private GestoraUsuarios gestorausuarios;

    public Biblioteca(GestoraUsuarios gu, GestoraLibros gl) {
        this.gestoraLibros = gl;
        this.gestorausuarios = gu;
    }

    public boolean anadirLibros(Libros libro) {
        return gestoraLibros.anadirLibros(libro);
    }

    public boolean añadirUsuarios(Usuario usuario){
        return gestorausuarios.anadirUsuarios(usuario);
        
    }

    public Libros[] buscarLibroPorTitulo(String titulo) {
        return gestoraLibros.buscarPorTitulo(titulo);
    }

    public Libros[] buscarLibroPorAutor(String autor) {
       return gestoraLibros.buscarPorAutor(autor);
    }

    public Libros[] buscarLibroPorCategoria(String categoria) {
        return gestoraLibros.buscarPorAutor(categoria);
    }

    public boolean validacionUsuario(String usuario, String contrasena) {
        return gestorausuarios.comprobar_Existencia_Usuario(usuario, contrasena);

    }

    public boolean validarAdmin(Usuario usuario) {
        return gestorausuarios.esAdmin(usuario);
    }

    public Usuario obtenerUsuario(String usuario, String contrasena) {
        return gestorausuarios.obtenerUsuarioReal(usuario, contrasena);
    }

    public String mostrarLibros(){
        return gestoraLibros.toString();
    }

}