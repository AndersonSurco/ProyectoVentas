
package servicio;

import negocio.*;
public interface ServicioPedido {
    public Pedido nuevoPedido(String cod,String porDes);
    public void agregarArticulo(String cod , String can);
    public void quitarArticulo(String cod);
    public String grabarPedido(String est,String dni);
}
