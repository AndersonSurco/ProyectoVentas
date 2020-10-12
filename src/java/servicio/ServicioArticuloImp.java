/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import negocio.Articulo;
import persistencia.DaoArticulo;
import persistencia.DaoArticuloImp;

public class ServicioArticuloImp implements ServicioArticulo{
    
    private DaoArticulo daoArt;
    
    public ServicioArticuloImp() {
        daoArt = new DaoArticuloImp();
    }

    @Override
    public Articulo buscaArticulo(String cod) {
        return daoArt.buscar(cod);
    }
    
}
