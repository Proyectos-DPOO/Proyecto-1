package Hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import Modelo.Habitacion;
import Modelo.Reserva;
import Modelo.Tarifa;

public class Recepcionista extends Login implements TipoUsuario {

    // Atributos
    private ArrayList<Reserva> listaReservas;

    public Recepcionista(String usuario, String contrasena, String tipoUsuario) {
        super(usuario, contrasena, tipoUsuario);
        this.listaReservas = new ArrayList<Reserva>();
    }

    public void crearReserva() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creando nueva reserva:");

        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Ingrese la fecha de entrada (formato YYYY-MM-DD): ");
        LocalDate fechaEntrada = LocalDate.parse(scanner.nextLine());

        System.out.print("Ingrese la fecha de salida (formato YYYY-MM-DD): ");
        LocalDate fechaSalida = LocalDate.parse(scanner.nextLine());

        System.out.print("Ingrese el número de habitaciones: ");
        int numHabitaciones = scanner.nextInt();

        System.out.print("Ingrese el número de personas: ");
        int numPersonas = scanner.nextInt();

        System.out.print("Ingrese el tipo de tarifa (Baja/Alta): ");
        String tipoTarifa = scanner.next();
        Tarifa tarifa;
        if (tipoTarifa.equalsIgnoreCase("Baja")) {
            tarifa = new TarifaBaja();
        } else {
            tarifa = new TarifaAlta();
        }

        Reserva reserva = new Reserva(nombreCliente, fechaEntrada, fechaSalida, numHabitaciones, numPersonas, tarifa);

        System.out.println("Reserva creada: " + reserva.toString());
        reservas.add(reserva);
    }


    public void editarReserva() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione la reserva que desea editar:");
        ArrayList<Reserva> resultadosBusqueda = buscarReserva();
        if (resultadosBusqueda.isEmpty()) {
            System.out.println("No se encontraron reservas.");
        } else {
            System.out.println("Seleccione la reserva que desea editar:");
            for (int i = 0; i < resultadosBusqueda.size(); i++) {
                System.out.println((i + 1) + ". " + resultadosBusqueda.get(i));
            }
            int opcion = scanner.nextInt();
            if (opcion < 1 || opcion > resultadosBusqueda.size()) {
                System.out.println("Opción inválida.");
            } else {
                Reserva reserva = resultadosBusqueda.get(opcion - 1);
                System.out.print("Ingrese el nombre del cliente: ");
                scanner.nextLine();
                String nombreCliente = scanner.nextLine();
                System.out.print("Ingrese la fecha de entrada (yyyy-mm-dd): ");
                LocalDate fechaEntrada = LocalDate.parse(scanner.nextLine());
                System.out.print("Ingrese la fecha de salida (yyyy-mm-dd): ");
                LocalDate fechaSalida = LocalDate.parse(scanner.nextLine());
                System.out.print("Ingrese el número de habitaciones: ");
                int numHabitaciones = scanner.nextInt();
                System.out.print("Ingrese el número de personas: ");
                int numPersonas = scanner.nextInt();
                editarReserva(reserva, nombreCliente, fechaEntrada, fechaSalida, numHabitaciones, numPersonas);
            }
        }
    }

    public void eliminarReserva() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione la reserva que desea eliminar:");
        for (int i = 0; i < listaReservas.size(); i++) {
            System.out.println(i + ". " + listaReservas.get(i));
        }
        int opcion = scanner.nextInt();
        Reserva reservaAEliminar = listaReservas.get(opcion);
        listaReservas.remove(reservaAEliminar);
        System.out.println("Reserva eliminada con éxito.");
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("1. Crear reserva");
            System.out.println("2. Editar reserva");
            System.out.println("3. Eliminar reserva");
            System.out.println("4. Buscar reserva");
            System.out.println("5. Listar habitaciones disponibles");
            System.out.println("6. Cerrar sesión");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearReserva();
                    break;
                case 2:
                    editarReserva();
                    break;
                case 3:
                    eliminarReserva();
                    break;
                case 4:
                    buscarReserva();
                    break;
                case 5:
                    listarHabitacionesDisponibles();
                    break;
                case 6:
                    System.out.println("Sesión cerrada");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }
