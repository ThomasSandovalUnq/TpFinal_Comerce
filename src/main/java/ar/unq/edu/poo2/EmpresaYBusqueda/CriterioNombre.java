package ar.unq.edu.poo2.EmpresaYBusqueda;

import ar.unq.edu.poo2.Catalogo.ItemCatalogo;

public class CriterioNombre implements CriterioBusqueda {
    
	private String textoBuscado;

    public CriterioNombre(String texto) {
        this.textoBuscado = texto.toLowerCase();
    }

    @Override
    public boolean satisface(ItemCatalogo item) {
        return item.getNombre().toLowerCase().contains(textoBuscado);
    }
}
