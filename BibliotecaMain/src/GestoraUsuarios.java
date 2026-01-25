public class GestoraUsuarios {
    private int cantidad;
    private Usuario listaUsuarios[];
    private static final int MAX_USUARIOS = 100;

    public GestoraUsuarios() {
        this.cantidad = 0;
        this.listaUsuarios = new Usuario[MAX_USUARIOS];
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

    public boolean anadirUsuarios(Usuario usuario) {
        if (cantidad < MAX_USUARIOS) {
            listaUsuarios[cantidad] = usuario;
            cantidad++;
            return true;
        }else{
            return false;
        }
    }

    public Usuario obtenerUsuarioReal(String nombreUsuario, String contrasena){
        for(int i =0; i < cantidad ; i++){
            Usuario u = listaUsuarios[i];
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
