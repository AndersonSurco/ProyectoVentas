/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import negocio.Articulo;
import negocio.Empleado;

/**
 *
 * @author ander
 */
public class DaoArticuloImp implements DaoArticulo{

    @Override
    public Articulo buscar(String cod) {
        String sql ="select * from articulo where cod='"+cod+"'";
        Object[]fila = operacion.buscar(sql);
        if(fila != null){
            Articulo art = new Articulo();
            art.setCod(fila[0].toString());
            art.setNom(fila[1].toString());
            art.setPre((double) fila[2]);
            return art;
        }
        return null;
        
    }

    
    
}
