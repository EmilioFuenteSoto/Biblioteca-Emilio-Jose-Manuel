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

    public Boolean getAdmin(){
        return this.admin;
    }

    //Metodos
    // public void anadirUsuarios(String nombre, String contrasena){
    //     Usuario usuario = new Usuario();
    //     listaUsuarios[cantidad] = usuario;
    //     cantidad++;
    // }

    // public void anadirUsuariosAdmin(String nombre, String contrasena){
    //     Usuario usuario = new Usuario(true);
    //     listaUsuarios[cantidad] = usuario;
    //     cantidad++;
    // }



     
}
