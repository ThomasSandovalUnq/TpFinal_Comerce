package ar.unq.edu.poo2.Catalogo;

public class Producto extends ItemCatalogo {

	private Integer id;
	private String marca;
	private String categoria;
	
	public Producto(String n, String d, double pb, Integer id, String m, String c) {
		super(n, d, pb);
		this.id = id;
		this.marca = m;
		this.categoria = c;
	}

	public Integer getId() {
		return id;
	}

	public String getMarca() {
		return marca;
	}

	public String getCategoria() {
		return categoria;
	}	

}
