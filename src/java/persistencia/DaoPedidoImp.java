/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import negocio.Linea;
import negocio.Pedido;

/**
 *
 * @author ander
 */
public class DaoPedidoImp implements DaoPedido{

    @Override
    public String grabarPedido(Pedido ped) {
 
        String sql = "insert into pedido values('"+ped.getNum()+"','"+ped.getFec() +"','"+ped.getEst() +"',"+ped.getTot()+",'"+ ped.getCli().getDni()+"','"+ ped.getEmp().getCod()+"')";
        return operacion.ejecutar(sql);
    }
    @Override
    public String grabarDetalle(Pedido ped, Linea lin) {
        String sql ="insert into detalle values ('"+ped.getNum()+"','"+lin.getArt().getCod()+"',"+lin.getCan()+")";
        return operacion.ejecutar(sql);
    }
    
}
