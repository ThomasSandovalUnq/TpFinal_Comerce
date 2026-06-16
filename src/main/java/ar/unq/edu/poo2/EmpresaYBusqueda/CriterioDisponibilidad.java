package ar.unq.edu.poo2.EmpresaYBusqueda;

import java.util.List;

import ar.unq.edu.poo2.Catalogo.ItemCatalogo;
import ar.unq.edu.poo2.Sucursal.Sucursal;

public class CriterioDisponibilidad implements CriterioBusqueda {
    private List<Sucursal> red;

    public CriterioDisponibilidad(List<Sucursal> red) {
        this.red = red;
    }

    @Override
    public boolean satisface(ItemCatalogo item) {
        return red.stream().anyMatch(r -> r.tieneStockLocal(item, 1));
    }
}