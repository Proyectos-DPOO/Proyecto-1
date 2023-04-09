package Modelo;

import java.time.LocalDate;

public class Reserva {
    
    private String nombreCliente;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private int numHabitacion;
    private int numPersonas;
    private Tarifa tarifa;
    private double precioTotal;
    private TipoHabitacion tipoHabitacion;
    
    public Reserva(String nombreCliente, LocalDate fechaEntrada, LocalDate fechaSalida, int numHabitaciones, int numPersonas, Tarifa tarifa) {
        this.nombreCliente = nombreCliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.numHabitacion = numHabitaciones;
        this.numPersonas = numPersonas;
        this.tarifa = tarifa;
        this.precioTotal = calcularPrecioTotal();
       
    }
    
    private double calcularPrecioTotal() {
        return tarifa.calcularPrecioTotal(fechaEntrada, fechaSalida);
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
        this.precioTotal = calcularPrecioTotal();
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    
    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }


    @Override
    public String toString() {
        return "Reserva [nombreCliente=" + nombreCliente + ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida
                + ", numHabitacion=" + numHabitacion + ", numPersonas=" + numPersonas + ", tarifa=" + tarifa
                + ", precioTotal=" + precioTotal + "]";
    }
    
}

