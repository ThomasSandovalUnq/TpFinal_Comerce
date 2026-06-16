package ar.unq.edu.poo2.EmpresaYBusqueda;

import ar.unq.edu.poo2.Catalogo.ItemCatalogo;

public class CriterioNot implements CriterioBusqueda {
    private CriterioBusqueda criterioEnvuelto;

    public CriterioNot(CriterioBusqueda c) {
        this.criterioEnvuelto = c;
    }

    @Override
    public boolean satisface(ItemCatalogo item) {
        return !criterioEnvuelto.satisface(item);
    }
}