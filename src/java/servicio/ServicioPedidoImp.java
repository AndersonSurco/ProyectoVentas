
package servicio;

import negocio.*;
import persistencia.*;
public class ServicioPedidoImp implements ServicioPedido{
    
    private ServicioEmpleado serEmp;
    private servicioCliente serCli;
    private ServicioArticulo serArt;
    private DaoPedido daoPed;
    private Pedido ped;
    public ServicioPedidoImp() {
        serEmp = new ServicioEmpleadoImp();
        serCli = new ServicioClienteImp();
        serArt = new ServicioArticuloImp();
        daoPed = new DaoPedidoImp();
    }

    @Override
    public Pedido nuevoPedido(String cod, String porDes) {
        
        ped = new Pedido();
        ped.setNum(this.getNum());
        ped.setFec(this.getFec());
        ped.setEmp(serEmp.buscarEmpleado(cod));
        ped.setPorDes(Double.parseDouble(porDes));
        
        return ped;
    }

    @Override
    public void agregarArticulo(String cod, String can) {
        ped.agregar(serArt.buscaArticulo(cod),Integer.parseInt(can));
    }
    
    @Override
    public void quitarArticulo(String cod) {
        ped.quitar(cod);
    }

    @Override
    public String grabarPedido(String est, String dni) {
        ped.setEst(est);
        ped.setCli(serCli.buscarCliente(dni));
        String msg = daoPed.grabarPedido(ped);
        for (int i = 0; i < ped.getCesta().size(); i++) {
            Linea lin = (Linea)ped.getCesta().get(i);
            msg = daoPed.grabarDetalle(ped, lin);
        }
        return msg;
    }
    
    private String getNum(){
        return "p00008";
    }
    
    private String getFec(){
        return "10/10/2020";
    }
}
