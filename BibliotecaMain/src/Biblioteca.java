public class Biblioteca {
    private GestoraLibros gestoraLibros;
    private GestoraUsuarios gestoraUsuarios;

    public Biblioteca(GestoraUsuarios gu, GestoraLibros gl) {
        this.gestoraLibros = gl;
        this.gestoraUsuarios = gu;
    }

    public boolean anadirLibros(Libros libro) {
        return gestoraLibros.anadirLibros(libro);
    }

    public boolean anadirUsuarios(Usuario usuario){
        return gestoraUsuarios.anadirUsuarios(usuario);
        
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
        return gestoraUsuarios.comprobarExistenciaUsuario(usuario, contrasena);

    }

    public boolean eliminarUsuario(String usuario){
        return gestoraUsuarios.eliminarUsuario(usuario);
    }

    public boolean eliminarLibros(String titulo){
        return gestoraLibros.eliminarLibros(titulo);
    }


    public boolean validarAdmin(Usuario usuario) {
        return gestoraUsuarios.esAdmin(usuario);
    }

    public Usuario obtenerUsuario(String usuario, String contrasena) {
        return gestoraUsuarios.obtenerUsuarioReal(usuario, contrasena);
    }

    public String mostrarLibros(){
        return gestoraLibros.toString();
    }

    public String mostrarUsuarios(){
        return gestoraUsuarios.toString();
    }

    public String mostrarLibrosPrestados(){
        return gestoraLibros.mostrarLibrosPrestados();
    }

     public boolean anadirLibrosPrestados(String titulo, Usuario usuario) {
        return gestoraLibros.prestamoLibros(titulo, usuario);
    }

    public boolean devolverLibrosPres(String titulo){
        return gestoraLibros.devolverLibroPrestado(titulo);

    }

}