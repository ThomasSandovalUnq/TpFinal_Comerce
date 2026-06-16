package ar.unq.edu.poo2.EmpresaYBusqueda;

import ar.unq.edu.poo2.Catalogo.ItemCatalogo;

public class CriterioAnd implements CriterioBusqueda {
    private CriterioBusqueda criterio1;
    private CriterioBusqueda criterio2;

    
    public CriterioAnd(CriterioBusqueda c1, CriterioBusqueda c2) {
        this.criterio1 = c1;
        this.criterio2 = c2;
    }

    @Override
    public boolean satisface(ItemCatalogo item) {
        return criterio1.satisface(item) && criterio2.satisface(item);
    }
}