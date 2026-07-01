package ar.unq.edu.poo2.Sucursal;
import ar.unq.edu.poo2.Catalogo.ItemCatalogo;
import java.util.HashMap;
import java.util.Map;


public class DepositoGeneral {
	
    private Map<ItemCatalogo, Integer> stock;
    
    public DepositoGeneral() {
        this.stock = new HashMap<>();
    }
    
    public void registrarStock(ItemCatalogo item, int cantidad) {
        this.stock.put(item, this.stock.getOrDefault(item, 0) + cantidad);
    }
    
    public boolean tieneStock(ItemCatalogo item, int cantidad) {
        return this.stock.getOrDefault(item, 0) >= cantidad;
    }
    
    public void decrementarStock(ItemCatalogo item, int cantidad) {
        if (!tieneStock(item, cantidad)) {
            throw new RuntimeException("Stock insuficiente en el Depósito General");
        }
        this.stock.put(item, this.stock.get(item) - cantidad);
    }
    
    public void incrementarStock(ItemCatalogo item, int cantidad) {
        registrarStock(item, cantidad);
    }
}