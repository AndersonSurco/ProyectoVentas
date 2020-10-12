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
public interface DaoCliente {
    public Cliente buscar(String dni);
}
