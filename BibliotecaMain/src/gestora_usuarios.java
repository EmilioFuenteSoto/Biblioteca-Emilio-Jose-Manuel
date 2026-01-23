public class gestora_usuarios {
    private int cantidad;
    private Usuario[] usuarios;
    private static final int MAX_USUARIO = 100;

    public gestora_usuarios() {
        this.usuarios= new Usuario[MAX_USUARIO];
        this.cantidad = 0;
    }

    public boolean anadirUsuario(Usuario usuario) {
        if (cantidad < MAX_USUARIO) {
            usuarios[cantidad] = usuario;
            cantidad++;
            return true;
        }
        return false;

    }

    public void comprobar_Existencia_Usuario(Usuario usuario){
        for(int i =0; i < cantidad; i++){
             if(usuarios[i].getNombreUsuario().equals(usuario)){
                
             }else{
                
             }
        }
       
    }
}
