package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Factura {
    private int numero;
    private LocalDate fechaEmision;
    private Reserva reserva;
    private ArrayList<Servicio> servicios;

    public Factura(int numero, LocalDate fechaEmision, Reserva reserva) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.reserva = reserva;
        this.servicios = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public ArrayList<Servicio> getConsumos() {
        return servicios;
    }

    public void agregarConsumo(Servicio servicio) {
    	servicios.add(servicio);
    }

    public double calcularTotal() {
        double total = reserva.getPrecioTotal();

        for (Servicio servicio : servicios) {
            total += servicio.getPrecioTotal();
        }

        return total;
    }
}
