public class GestoraUsuarios {
    private int cantidad;
    private Usuario listaUsuarios[];



    public GestoraUsuarios()
    {
        this.cantidad = 0;     
    }

    
    public String infoUsuario(Usuario usuario){
        String info = "";
        info += usuario.getNombreUsuario();
        if(usuario.getAdmin()){
            info+="\nEs Admin";
        } else {
            info+="\nNo es admin";
        }  
        return info;
    }
}
