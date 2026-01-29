import java.util.Arrays;

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


    public boolean anadirUsuarios(Usuario usuario) {
        if (cantidad < MAX_USUARIOS) {
            listaUsuarios[cantidad] = usuario;
            cantidad++;
            return true;
        } else {
            return false;
        }
    }

    public Usuario obtenerUsuarioReal(String nombreUsuario, String contrasena) {
        for (int i = 0; i < cantidad; i++) {
            Usuario u = listaUsuarios[i];
            if (u.getNombreUsuario().equals(nombreUsuario) && u.getContrasena().equals(contrasena)) {
                return u;
            }
        }

        return null;

    }

    public boolean comprobarExistenciaUsuario(String usuario, String contrasena) {
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

    public Usuario[] mostrarUsuariosConMasPrestamos(){
        Usuario[] usuarios = new Usuario[MAX_USUARIOS];
        int maximo = 0;
        for (int i = 0; i < cantidad; i++) {
            if(listaUsuarios[i].getPrestamosEnCurso()>maximo)
            maximo = listaUsuarios[i].getPrestamosEnCurso();
        }
        int cont = -1;
        for (int i = 0; i < cantidad; i++) {
            if(listaUsuarios[i].getPrestamosEnCurso() == maximo){
                cont++;
                usuarios[cont] = listaUsuarios[i];
            }
        }

        Usuario[] arrayUsuariosTamanoAjustado = Arrays.copyOf(usuarios, cont+1);

        return arrayUsuariosTamanoAjustado;
    } 

    public void anadirUsuariosAdmin(Usuario usuario){
    if (cantidad < MAX_USUARIOS) {
    listaUsuarios[cantidad] = usuario;
    cantidad++;
    
    }
    }

    public boolean eliminarUsuario(String usuario){
        boolean eliminado = false;
        for (int i = 0; i < cantidad; i++) {
            if (listaUsuarios[i].getNombreUsuario().equals(usuario)) {
                for (int j = i; j < cantidad - 1; j++) {
                    listaUsuarios[j] = listaUsuarios[j + 1];
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
        String infoUsuarios = "";
        for(int i =0; i < cantidad; i++){
            infoUsuarios+=listaUsuarios[i].toString();
        }
        return infoUsuarios;
    }
}
