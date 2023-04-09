package Hotel;

import java.util.ArrayList;
import java.util.Scanner;


import Modelo.Habitacion;
import Modelo.Servicio;
import Modelo.Tarifa;
import Modelo.Usuario;

public class Administrador extends Login implements TipoUsuario {

    // Atributos
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Habitacion> listaHabitaciones;
    private ArrayList<Servicio> listaServicios;
    private ArrayList<Tarifa> listaTarifas;

    // Constructor
    public Administrador(String nombreUsuario, String contrasena, String tipoUsuario) {
        super(nombreUsuario, contrasena, tipoUsuario);
        this.listaUsuarios = new ArrayList<>();
        this.listaHabitaciones = new ArrayList<>();
        this.listaServicios = new ArrayList<>();
        this.listaTarifas = new ArrayList<>();
    }

    // Métodos

    // Usuarios
    public void crearUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public void editarUsuario(String nombreUsuario, Usuario usuario) {
        int index = -1;
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getNombre().equals(nombreUsuario)) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            listaUsuarios.set(index, usuario);
        }
    }

    public void eliminarUsuario(String nombreUsuario) {
        int index = -1;
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getNombre().equals(nombreUsuario)) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            listaUsuarios.remove(index);
        }
    }

    // Habitaciones
    public void crearHabitacion(Habitacion habitacion) {
        listaHabitaciones.add(habitacion);
    }

    public void editarHabitacion(int numeroHabitacion, Habitacion habitacion) {
        int index = -1;
        for (int i = 0; i < listaHabitaciones.size(); i++) {
            if (listaHabitaciones.get(i).getNumero() == numeroHabitacion) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            listaHabitaciones.set(index, habitacion);
        }
    }

    public void eliminarHabitacion(int numeroHabitacion) {
        int index = -1;
        for (int i = 0; i < listaHabitaciones.size(); i++) {
            if (listaHabitaciones.get(i).getNumero() == numeroHabitacion) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            listaHabitaciones.remove(index);
        }
    }

    // Servicios
    public void crearServicio(Servicio servicio) {
        listaServicios.add(servicio);
    }
    
    public void editarServicio(Servicio servicio) {
        for (int i = 0; i < listaServicios.size(); i++) {
            if (listaServicios.get(i).getNombre().equals(servicio.getNombre())) {
                listaServicios.set(i, servicio);
                break;
            }
        }
    }
    
    public void eliminarServicio(String nombre) {
        for (int i = 0; i < listaServicios.size(); i++) {
            if (listaServicios.get(i).getNombre().equals(nombre)) {
                listaServicios.remove(i);
                break;
            }
        }
    }
    
    public void crearTarifa(Tarifa tarifa) {
    	listaTarifas.add(tarifa);
    	}
    public void editarTarifa(String tipo, Tarifa tarifa) {
        int index = -1;
        for (int i = 0; i < listaTarifas.size(); i++) {
            if (listaTarifas.get(i).getTipo().equals(tipo)) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            listaTarifas.set(index, tarifa);
        }
    }

    public void eliminarTarifa(String tipo) {
        int index = -1;
        for (int i = 0; i < listaTarifas.size(); i++) {
            if (listaTarifas.get(i).getTipo().equals(tipo)) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            listaTarifas.remove(index);
        }
    }

    // Implementación de métodos de la interfaz TipoUsuario
    @Override
    public void menu() {
        System.out.println("Bienvenido al menú de Administrador.");
        System.out.println("1. Administrar usuarios");
        System.out.println("2. Administrar habitaciones");
        System.out.println("3. Administrar servicios");
        System.out.println("4. Administrar tarifas");
        System.out.println("5. Cerrar sesión");
    }

    
    public int seleccionarOpcion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la opción deseada: ");
        int opcion = scanner.nextInt();
        scanner.close();
        return opcion;
        
    } 
}

       