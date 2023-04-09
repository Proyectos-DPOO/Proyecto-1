package Modelo;


public class TipoHabitacion {
    private String tipo;
    private Tarifa tarifa;
    private boolean tieneBalcón;
    private boolean tieneVista;
    private boolean tieneCocina;
    private int cantidadPersonas;
    private String tamañoCama;

    public TipoHabitacion(String tipo, Tarifa tarifa, boolean tieneBalcón,
                          boolean tieneVista, boolean tieneCocina, int cantidadPersonas, String tamañoCama) {
        this.tipo = tipo;
        this.tarifa = tarifa;
        this.tieneBalcón = tieneBalcón;
        this.tieneVista = tieneVista;
        this.tieneCocina = tieneCocina;
        this.cantidadPersonas = cantidadPersonas;
        this.tamañoCama = tamañoCama;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isTieneBalcón() {
        return tieneBalcón;
    }

    public void setTieneBalcón(boolean tieneBalcón) {
        this.tieneBalcón = tieneBalcón;
    }

    public boolean isTieneVista() {
        return tieneVista;
    }

    public void setTieneVista(boolean tieneVista) {
        this.tieneVista = tieneVista;
    }

    public boolean isTieneCocina() {
        return tieneCocina;
    }

    public void setTieneCocina(boolean tieneCocina) {
        this.tieneCocina = tieneCocina;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getTamañoCama() {
        return tamañoCama;
    }

    public void setTamañoCama(String tamañoCama) {
        this.tamañoCama = tamañoCama;
    }
}
