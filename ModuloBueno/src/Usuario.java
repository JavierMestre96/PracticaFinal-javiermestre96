public class Usuario {
    private final String usuario;
    private String nombre;
    private String apellidos;
    private String email;

    public Usuario(String usuario, String nombre, String apellidos, String email) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Usuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }


}
