package Hotel;

public abstract class Login implements TipoUsuario {
    private String nombre;
    private String contrasena;
    private String tipoUsuario;
    
    public Login(String nombre, String contrasena, String tipoUsuario) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.tipoUsuario = tipoUsuario;
    }
    
    public boolean login(String nombre, String contrasena) {
        if (this.nombre.equals(nombre) && this.contrasena.equals(contrasena)) {
            System.out.println("Iniciando sesión como " + this.tipoUsuario);
            return true;
        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos.");
            return false;
        }
    }
    
    public void cerrarSesion() {
        System.out.println("Cerrando sesión de " + this.tipoUsuario);
    }
}
