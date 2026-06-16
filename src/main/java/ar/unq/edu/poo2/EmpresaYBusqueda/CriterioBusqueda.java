package ar.unq.edu.poo2.EmpresaYBusqueda;

import ar.unq.edu.poo2.Catalogo.ItemCatalogo;

public interface CriterioBusqueda {
	boolean satisface(ItemCatalogo item);
}