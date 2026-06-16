package ar.unq.edu.poo2.EmpresaYBusqueda;

import ar.unq.edu.poo2.Catalogo.ItemCatalogo;

public class CriterioPrecioMaximo implements CriterioBusqueda {
    private double precioMaximo;

    public CriterioPrecioMaximo(double maximo) {
        this.precioMaximo = maximo;
    }

    @Override
    public boolean satisface(ItemCatalogo item) {
        return item.getPrecioBase() <= precioMaximo;
    }
}
