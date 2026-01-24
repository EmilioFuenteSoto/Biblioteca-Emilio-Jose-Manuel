public class Biblioteca {
    private gestoraLibros gestoraLibros;
    private GestoraUsuarios gestorausuarios;
    public Biblioteca() {

    }

    public void anadirLibros(String titulo, String categoria, String Autor) {
        Libros libro = new Libros(titulo, Autor, categoria);
    }

    public void buscarLibroPorTitulo(String titulo){
        gestoraLibros.buscarPorTitulo(titulo);
    }

    public void buscarLibroPorAutor(String autor){
        gestoraLibros.buscarPorAutor(autor);
    }

    
    public void buscarLibroPorCategoria(String categoria){
        gestoraLibros.buscarPorAutor(categoria);
    }

    public boolean validacionUsuario(String usuario, String contrasena){
        return gestorausuarios.comprobar_Existencia_Usuario(usuario, contrasena);
        
    }

    public boolean validarAdmin(Usuario usuario){
        return gestorausuarios.esAdmin(usuario);
    }

    public Usuario obtenerUsuario(String  usuario , String contrasena){
        return gestorausuarios.obtenerUsuarioReal(usuario, contrasena);
    }



   

}