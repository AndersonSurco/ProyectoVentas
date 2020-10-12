/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.util.List;
import negocio.Articulo;
import negocio.Cliente;
import negocio.Empleado;

/**
 *
 * @author ander
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Connection cn = new conexion().getConexion();
        if(cn!=null){
            System.out.println("Si hay conexion");
        }else{
            System.out.println("No hay conexion :c");
        }
        */
        /*DaoEmpleado daoEmp = new DaoEmpleadoImp();
        Empleado emp = new Empleado("E003","CHUN","FA", "FAA");
        String  msg = daoEmp.Grabar(emp);
        System.out.println(msg);
        
        List lista = operacion.listar("select * from empleado");
        if(lista != null){
            for (int i = 0; i < lista.size(); i++) {
                Object[]fil = (Object[])lista.get(i);
                System.out.println(fil[0]+" "+fil[1]+" "+fil[2]+" "+fil[3]);
            }
        }else{
            System.out.println("No hay lista");
        }
        
        DaoEmpleado daoEmp = new DaoEmpleadoImp();
        List lis = daoEmp.Listar();
        if(lis != null){
            for (int i = 0; i < lis.size(); i++) {
                Empleado emp = (Empleado)lis.get(i);
                System.out.println(emp.getCod()+" "+emp.getNom()+" "+emp.getUsu()+" "+emp.getPas());
            }
        }else{
            System.out.println("no hay lista");
        }
        
        String sql = "Select * from empleado where cod ='E004'";
        Object[]fila = operacion.buscar(sql);
        if(fila != null){
           System.out.println(fila[0]+" "+fila[1]+" "+fila[2]+" "+fila[3]);
        }else{
            System.out.println("No hay empleados");
        }
        
        DaoEmpleado daoEmp = new DaoEmpleadoImp();
        Empleado emp =daoEmp.buscar("E003");
        if(emp!=null){
            System.out.println(emp.getCod()+" "+emp.getNom()+" "+emp.getUsu()+" "+emp.getPas());
        }else{
            System.out.println("no hay empleado");
        }*/
        
        DaoArticulo daoArt = new DaoArticuloImp();
        Articulo a = daoArt.buscar("A001");
        System.out.println(a.getNom());
        
        /*DaoCliente daoCli = new DaoClienteImp();
        Cliente cli = daoCli.buscar("00000002");
        System.out.println(cli.getNom());*/
        
    }
    
}
