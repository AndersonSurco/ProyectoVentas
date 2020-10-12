/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import negocio.Articulo;
public interface ServicioArticulo {
    public Articulo buscaArticulo(String cod);
}
