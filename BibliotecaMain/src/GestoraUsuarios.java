public class GestoraUsuarios {
    private int cantidad;
    private Usuario listaUsuarios[];
    private static final int MAX_USUARIOS = 100;

    public GestoraUsuarios() {
        this.cantidad = 0;
    }

    // Metodos

    public boolean esAdmin(Usuario usuario) {
        if (usuario.getAdmin()) {
            return true;
        } else {
            return false;
        }
    }

    //@Override
    //public String toString(Usuario usuario) {

    //}

    public void anadirUsuarios(Usuario usuario) {
        if (cantidad < MAX_USUARIOS) {
            listaUsuarios[cantidad] = usuario;
            cantidad++;
        }
    }

    public Usuario obtenerUsuarioReal(String nombreUsuario, String contrasena){
        for(Usuario u: listaUsuarios){
           if (u.getNombreUsuario().equals(nombreUsuario) && u.getContrasena().equals(contrasena)) {
                return u;
           }
        }

        return null;
       
    }

    public boolean comprobar_Existencia_Usuario(String usuario, String contrasena) {
        boolean usuarioCorrecto = false;
        for (int i = 0; i < cantidad; i++) {
            if (listaUsuarios[i].getNombreUsuario().equals(usuario)
                    && listaUsuarios[i].getContrasena().equals(contrasena)) {
                usuarioCorrecto = true;
                return usuarioCorrecto;
            }
        }

        return usuarioCorrecto;

    }

    // public void anadirUsuariosAdmin(Usuario usuario){
    // if (cantidad < MAX_USUARIOS) {
    // listaUsuarios[cantidad] = usuario;
    // cantidad++;
    //
    // }
    // }
}
