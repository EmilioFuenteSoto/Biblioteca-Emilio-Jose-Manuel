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

    public Usuario(String usuario, String contrasena){
        this.contrasena = contrasena;
        this.nombreUsuario= usuario;
    }

    public Usuario(boolean admin){
        this();
        this.admin = admin;
    }

    //Getter y Setters

    public String getNombreUsuario(){
        return this.nombreUsuario;
    }

    public void setNombreUsuario(String nombre){
        if(nombre == null || nombre.isEmpty()){
            this.nombreUsuario = "none";
        }else{
            this.nombreUsuario = nombre;
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

    @Override
    public String toString(){
         return "\nNombre: " + getNombreUsuario() + " Contraseña: " + getContrasena() + " Admin: " + getAdmin();
    }
       
        
    }
     

