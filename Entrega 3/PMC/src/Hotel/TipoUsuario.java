package Hotel;

public interface TipoUsuario {
    boolean login(String nombre, String contrasena);
    void menu();
    void cerrarSesion();
}
