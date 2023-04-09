package Modelo;

import java.util.ArrayList;

public class Habitacion {
    private int numero;
    private TipoHabitacion tipoHabitacion;
    private boolean ocupada;
    private ArrayList<Reserva> reservas;

    public Habitacion(int numero, TipoHabitacion tipoHabitacion) {
        this.numero = numero;
        this.tipoHabitacion = tipoHabitacion;
        this.ocupada = false;
        this.reservas = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void addReserva(Reserva reserva) {
        this.reservas.add(reserva);
    
		
	}
}

