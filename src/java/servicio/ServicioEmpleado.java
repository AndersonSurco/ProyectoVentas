        
package servicio;

import negocio.Empleado;

public interface ServicioEmpleado {
    
    public Empleado validarEmpleado(String usu,String pas);
    public String grabarEmpleado(String cod,String nom,String usu,String pas);
    public Empleado buscarEmpleado(String cod);
    public String actualizarEmpleado(String cod , String pas);
    
}
