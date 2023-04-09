package Modelo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Tarifa {
    
    private String tipo;
    private double precioBase;
    private double recargoFinDeSemana;

    public Tarifa(String tipo, double precioBase, double recargoFinDeSemana) {
        this.tipo = tipo;
        this.precioBase = precioBase;
        this.recargoFinDeSemana = recargoFinDeSemana;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getRecargoFinDeSemana() {
        return recargoFinDeSemana;
    }

    public void setRecargoFinDeSemana(double recargoFinDeSemana) {
        this.recargoFinDeSemana = recargoFinDeSemana;
    }
    
    public double calcularPrecioTotal(LocalDate fechaEntrada, LocalDate fechaSalida) {
        int numDias = (int) ChronoUnit.DAYS.between(fechaEntrada, fechaSalida);
        boolean esFinDeSemana = false;
        for (LocalDate fecha = fechaEntrada; !fecha.isAfter(fechaSalida); fecha = fecha.plusDays(1)) {
            if (fecha.getDayOfWeek() == DayOfWeek.SATURDAY || fecha.getDayOfWeek() == DayOfWeek.SUNDAY) {
                esFinDeSemana = true;
                break;
            }
        }
        double precioTotal = precioBase * numDias;
        if (esFinDeSemana) {
            precioTotal += precioBase * recargoFinDeSemana * numDias;
        }
        return precioTotal;
    }

    @Override
    public String toString() {
        return "Tarifa [tipo=" + tipo + ", precioBase=" + precioBase + ", recargoFinDeSemana=" + recargoFinDeSemana + "]";
    }
    
}
