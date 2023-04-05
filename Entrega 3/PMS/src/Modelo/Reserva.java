package Modelo;

import java.time.LocalDate;
import java.util.Date;

public class Reserva {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Habitacion habitacion;
    private Usuario usuario;

    public Reserva(LocalDate fechaInicio, LocalDate fechaFin, Habitacion habitacion, Usuario cliente) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.habitacion = habitacion;
        this.usuario = cliente;
        this.habitacion.addReserva(this);
    }

    public Reserva(String nombreCliente, Date fechaEntrada, Date fechaSalida, int numHabitaciones, int numPersonas) {
		// TODO Auto-generated constructor stub
	}

	public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Usuario getCliente() {
        return usuario;
    }

    public void setCliente(Usuario cliente) {
        this.usuario = cliente;
    }

    public double getTotal() {
        return this.habitacion.getTipoHabitacion().getTarifa(this.fechaInicio, this.fechaFin);
    }
}
 