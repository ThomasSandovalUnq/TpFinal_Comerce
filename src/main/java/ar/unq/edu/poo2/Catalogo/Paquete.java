package ar.unq.edu.poo2.Catalogo;

import java.util.ArrayList;
import java.util.List;

public class Paquete extends ItemCatalogo {
	private List<ItemCatalogo> pack;
	private double descuento; 
	
	public Paquete(String n, String d, double desc) {
		super(n, d);
		this.pack = new ArrayList<>();
		this.descuento = desc;
	}

	public double getDescuento() {
		return descuento; 
	}
	
	public void agregarAPaquete(ItemCatalogo c) {
		this.pack.add(c);
	}

	@Override
	public double getPrecioBase() {
		return this.pack.stream().mapToDouble(ItemCatalogo::getPrecioBase).sum();
	}
	
	@Override
	public double precioFinal() {
		double sumaFinalItems = this.pack.stream().mapToDouble(ItemCatalogo::precioFinal).sum();
		return sumaFinalItems * (1 - (this.getDescuento() / 100.0));
	}
	
	
	
}