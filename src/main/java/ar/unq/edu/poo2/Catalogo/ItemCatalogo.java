package ar.unq.edu.poo2.Catalogo;

public abstract class ItemCatalogo {
	private String nombre;
	private String descripcion;
	
	public ItemCatalogo(String n, String d) {
		this.nombre = n;
		this.descripcion = d;
	}
	
	public String getNombre() { return this.nombre; }
	public String getDescripcion() { return this.descripcion; }
	
	public abstract double getPrecioBase(); 
	public abstract double precioFinal();
}