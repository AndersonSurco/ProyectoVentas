
package negocio;

import java.util.List;

public class Prueba {

   
    public static void main(String[] args) {
        
        Articulo a1 = new Articulo("A0001","Articulo 1",10);
        Articulo a2 = new Articulo("A0002","Articulo 2",20);
        Articulo a3 = new Articulo("A0003","Articulo 3",30);
        
        Pedido p = new Pedido();
        p.agregar(a1,10);
        p.agregar(a2,10);
        p.agregar(a3,10);
        //p.quitar("A0002");
        List cesta = p.getCesta();
        
        for (int i = 0; i < cesta.size(); i++) {
            Linea lin = (Linea)cesta.get(i);
            System.out.println(lin.getArt().getCod()+" "+lin.getArt().getNom()+" "+lin.getArt().getPre()+" "+lin.getCan()+" "+lin.getImp());
            
        }

        System.out.println("Sub Total: "+p.getSubTot());
        p.setPorDes(10);
        System.out.println("Descuento: "+p.getDes());
        System.out.println("Total:     "+p.getTot());
       
    }
    
}
