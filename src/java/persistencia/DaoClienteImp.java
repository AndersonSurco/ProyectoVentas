/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;
import negocio.*;
/**
 *
 * @author ander
 */
public class DaoClienteImp implements DaoCliente{

    @Override
    public Cliente buscar(String dni) {
        String sql ="select * from cliente where dni='"+dni+"'";
        Object[]fila = operacion.buscar(sql);
        if(fila != null){
            Cliente cli = new Cliente();
            cli.setDni(fila[0].toString());
            cli.setNom(fila[1].toString());
            cli.setDir(fila[2].toString());
            return cli;
        }
        return null;
    }
    
}
