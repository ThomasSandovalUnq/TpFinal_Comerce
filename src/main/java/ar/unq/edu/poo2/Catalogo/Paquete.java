package ar.unq.edu.poo2.Catalogo;

import java.util.List;

public class Paquete extends ItemCatalogo {

	private List<ItemCatalogo> pack;
	private double descuento;
	
	public Paquete(String n, String d, double pb, List<ItemCatalogo> p, double desc) {
		super(n, d, pb);
		this.pack = p;
		this.descuento = desc;
	}

	public List<ItemCatalogo> getPack() {
		return pack;
	}

	public double getDescuento() {
		return descuento;
	}
	
	public void agregarAPaquete(ItemCatalogo c) {
		this.pack.add(c);
	}
	
	
}
