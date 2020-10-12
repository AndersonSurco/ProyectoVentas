
package persistencia;

import java.util.List;
import negocio.Empleado;

public interface DaoEmpleado {
    
    public String Grabar(Empleado emp);
    public List Listar();
    public Empleado buscar(String cod);
    public String actualizar(Empleado emp);
    
    
}
