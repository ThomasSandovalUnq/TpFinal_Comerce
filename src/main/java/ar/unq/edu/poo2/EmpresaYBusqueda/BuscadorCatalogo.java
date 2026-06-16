package ar.unq.edu.poo2.EmpresaYBusqueda;

import ar.unq.edu.poo2.Catalogo.ItemCatalogo;
import java.util.List;
import java.util.stream.Collectors;

public class BuscadorCatalogo {
    public List<ItemCatalogo> buscar(List<ItemCatalogo> catalogoMaestro, CriterioBusqueda criterio) {
        return catalogoMaestro.stream()
                .filter(item -> criterio.satisface(item))
                .collect(Collectors.toList());
    }
}