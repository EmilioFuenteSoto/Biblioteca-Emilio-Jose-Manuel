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

     public void comprobar_Existencia_Usuario(Usuario usuario){
        for(int i =0; i < cantidad; i++){
             if(listaUsuarios[i].getNombreUsuario().equals(usuario)){
                
             }else{
                
             }
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
