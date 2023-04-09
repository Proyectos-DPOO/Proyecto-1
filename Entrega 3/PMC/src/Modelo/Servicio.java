package Modelo;



public class Servicio {
    private String nombre;
    private double precio;
    private int cantidad;
    private int idServ;
    
    public Servicio(String nombre, double precio, int cantidad, int idServ) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.idServ = idServ;
    }
    
    

	public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public double getPrecioTotal() {
        return precio * cantidad;
    }

	/**
	 * @return the idServ
	 */
	public int getIdServ() {
		return idServ;
	}

	/**
	 * @param idServ the idServ to set
	 */
	public void setIdServ(int idServ) {
		this.idServ = idServ;
	}
}

