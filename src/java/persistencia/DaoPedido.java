
package persistencia;
import negocio.*;

/**
 *
 * @author ander
 */
public interface DaoPedido {
    public String grabarPedido(Pedido ped);
    public String grabarDetalle(Pedido ped,Linea lin);
    
}
