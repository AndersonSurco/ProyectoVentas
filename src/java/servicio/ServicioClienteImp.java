/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import negocio.Cliente;
import persistencia.DaoCliente;
import persistencia.DaoClienteImp;

/**
 *
 * @author ander
 */
public class ServicioClienteImp implements servicioCliente{
    private DaoCliente daoCli;

    public ServicioClienteImp() {
        daoCli = new DaoClienteImp();
    }
    
    @Override
    public Cliente buscarCliente(String dni) {
        return daoCli.buscar(dni);
    }
    
}
