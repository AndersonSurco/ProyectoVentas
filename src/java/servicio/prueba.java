
package servicio;

import negocio.Empleado;
import negocio.Pedido;

public class prueba {

    
    public static void main(String[] args) {
        
        ServicioEmpleado ser = new ServicioEmpleadoImp();
        /*Empleado emp = ser.validarEmpleado("emp 2","emp2");
        if(emp != null){
            System.out.println("Acceso Permitido "+emp.getNom());
        }else{
            System.out.println("Credenciales incorrectas");
        }*/
        
        //String msg = ser.grabarEmpleado("E004","Empleado 4", "emp4","emp4");
        //Empleado emp = ser.buscarEmpleado("E003");
        //String msg = ser.actualizarEmpleado("E004", "alfa");
        //System.out.println(msg);
        
        ServicioPedido serPed = new ServicioPedidoImp();
        Pedido ped = serPed.nuevoPedido("0001","10");
        serPed.agregarArticulo("A001","10");
        serPed.agregarArticulo("A002","10");
        String msg = serPed.grabarPedido("Atendido","0000001");
        System.out.println(msg);
        
    }
    
}
