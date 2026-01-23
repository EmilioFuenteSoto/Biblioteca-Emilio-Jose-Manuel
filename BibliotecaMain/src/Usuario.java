public class Usuario {

    private boolean admin;
    private String nombreUsuario;
    private String contrasena;
    

    //Constructores
    public Usuario(){
        this.admin = false;
        this.nombreUsuario = "none";
        this.contrasena = "1234";
    }

    public Usuario(boolean admin){
        this();
        this.admin = admin;
    }

    //Getter y Setters

    public String getNombreUsuario(){
        return this.nombreUsuario;
    }

    public void setNombre(String nombre){
        this.nombreUsuario = nombreUsuario;
        if(nombre == ""){
            nombre = "none";
        }
    }

    public void setContrasena(String contrasena){
        this.contrasena = contrasena;
    }

    public String getContrasena(){
        return this.contrasena;
    }

    public Boolean getAdmin(){
        return this.admin;
    }

    //Metodos

    
    public String toString(Usuario usuario){
         return "Nombre: " + getNombreUsuario() + " Contraseña: " + getContrasena() + " Admin: " + getAdmin();
    }



    public boolean comprobarAdmin(){
        
        boolean esAdmin = false;
        if(this.admin){
            esAdmin = true;
            return esAdmin;
        }

        return false;

        
    }
     
}
