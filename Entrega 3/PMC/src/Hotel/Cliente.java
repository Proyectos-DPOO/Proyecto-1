package Hotel;

import java.util.ArrayList;

import Modelo.Reserva;
import Modelo.Servicio;

public class Cliente extends Login implements TipoUsuario {
    
    private String nombreCompleto;
    private String correoElectronico;
    
    
    private ArrayList<Reserva> listaReservas;
    private ArrayList<Servicio> listaServicios;
    
    public Cliente(String nombreUsuario, String contrasena, String nombreCompleto, String correoElectronico, String tipoUusuario) {
        super(nombreUsuario, contrasena, tipoUusuario);
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
        listaReservas = new ArrayList<>();
        listaServicios = new ArrayList<>();
    }
    
    public void realizarReserva(Hotel hotel, Reserva reserva) {
        hotel.agregarReserva(reserva);
        listaReservas.add(reserva);
        System.out.println("Reserva realizada exitosamente");
    }
    
    public void buscarReserva(String nombreCliente) {
        System.out.println("Reservas de " + nombreCliente + ":");
        for (Reserva reserva : listaReservas) {
            if (reserva.getCliente().equals(nombreCliente)) {
                System.out.println(reserva);
            }
        }
    }
    
    public void cancelarReserva(Reserva reserva) {
        if (listaReservas.contains(reserva)) {
            listaReservas.remove(reserva);
            System.out.println("Reserva cancelada exitosamente");
        } else {
            System.out.println("La reserva no existe");
        }
    }
    
    public void listarServiciosDisponibles(Hotel hotel) {
        System.out.println("Servicios disponibles:");
        for (Servicio servicio : hotel.getListaServicios()) {
            System.out.println(servicio);
        }
    }
    @Override
    public void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("----- Menú del Cliente -----");
            System.out.println("1. Realizar reserva");
            System.out.println("2. Buscar reserva");
            System.out.println("3. Cancelar reserva");
            System.out.println("4. Listar servicios disponibles");
            System.out.println("5. Cerrar sesión");
            System.out.print("Ingrese la opción deseada: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer de entrada
            switch (opcion) {
                case 1:
                    realizarReserva();
                    break;
                case 2:
                	buscarReserva();
                    break;
                case 3:
                    cancelarReserva();
                    break;
                case 4:
                    listarServiciosDisponibles();
                    break;
                case 5:
                    cerrarSesion();
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 5);
    }
}
