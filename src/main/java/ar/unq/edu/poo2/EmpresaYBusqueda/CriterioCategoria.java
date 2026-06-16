package ar.unq.edu.poo2.EmpresaYBusqueda;

import ar.unq.edu.poo2.Catalogo.ItemCatalogo;
import ar.unq.edu.poo2.Catalogo.Producto;

public class CriterioCategoria implements CriterioBusqueda {
    private String categoriaBuscada;

    public CriterioCategoria(String categoria) {
        this.categoriaBuscada = categoria.toLowerCase();
    }

    @Override
    public boolean satisface(ItemCatalogo item) {
        // Como los Paquetes no tienen categoría propia, verificamos si es un Producto
        if (item instanceof Producto) {
            Producto prod = (Producto) item;
            return prod.getCategoria().toLowerCase().equals(categoriaBuscada);
        }
        return false; 
    }
}