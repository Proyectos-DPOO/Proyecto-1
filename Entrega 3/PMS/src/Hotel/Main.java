package Hotel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de gestión de hoteles.");

        while (true) {
            System.out.println("Por favor, seleccione su tipo de usuario:");
            System.out.println("1. Administrador");
            System.out.println("2. Recepcionista");
            System.out.println("3. Cliente");
            System.out.println("4. Salir");
            scanner.close();

            int opcionSeleccionada = scanner.nextInt();
            switch (opcionSeleccionada) {
                case 1:
                    System.out.println("Ingrese su nombre de usuario:");
                    String nombreDeUsuarioAdmin = scanner.next();
                    System.out.println("Ingrese su contraseña:");
                    String contrasenaAdmin = scanner.next();
                    TipoUsuario admin = new Administrador(nombreDeUsuarioAdmin, contrasenaAdmin);
                    Menu menuAdmin = new Menu(admin);
                    menuAdmin.mostrarMenu();
                    break;
                case 2:
                    System.out.println("Ingrese su nombre de usuario:");
                    String nombreDeUsuarioRec = scanner.next();
                    System.out.println("Ingrese su contraseña:");
                    String contrasenaRec = scanner.next();
                    TipoUsuario recep = new Recepcionista(nombreDeUsuarioRec, contrasenaRec);
                    Menu menuRecep = new Menu(recep);
                    menuRecep.mostrarMenu();
                    break;
                case 3:
                    System.out.println("Ingrese su nombre de usuario:");
                    String nombreDeUsuarioCli = scanner.next();
                    System.out.println("Ingrese su contraseña:");
                    String contrasenaCli = scanner.next();
                    TipoUsuario cliente = new Cliente(nombreDeUsuarioCli, contrasenaCli);
                    Menu menuCliente = new Menu(cliente);
                    menuCliente.mostrarMenu();
                    break;
                case 4:
                    System.out.println("Hasta luego.");
                    return;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}
