public class GestoraUsuarios {
    private int cantidad;
    private Usuario listaUsuarios[];
    private static final int MAX_USUARIOS = 100;



    public GestoraUsuarios()
    {
        this.cantidad = 0;     
    }

    //Metodos
    
    public boolean esAdmin(Usuario usuario){
        if(usuario.getAdmin()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString(Usuario usuario){

    }

    public void anadirUsuarios(Usuario usuario){
        if (cantidad < MAX_USUARIOS) {
            listaUsuarios[cantidad] = usuario;
            cantidad++;
        }    
    }

    // public void anadirUsuariosAdmin(Usuario usuario){
    //     if (cantidad < MAX_USUARIOS) {
    //         listaUsuarios[cantidad] = usuario;
    //         cantidad++;
    //              
    //     } 
    // }
}
