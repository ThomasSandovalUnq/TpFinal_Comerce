package ar.unq.edu.poo2.Catalogo;

public abstract class ItemCatalogo {

	private String nombre;
	private String descripcion;
	private double precioBase;
	
	public ItemCatalogo(String n, String d, double pb) {
		this.nombre = n;
		this.descripcion = d;
		this.precioBase = pb;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public double getPrecioBase() {
		return this.precioBase;
	}
}
