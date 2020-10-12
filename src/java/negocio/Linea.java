
package negocio;


public class Linea {
    private Articulo art;
    private int can;

    public double getImp() {
        return art.getPre()*can;
    }

    public Linea() {
    }
    
    public Linea(Articulo art, int can) {
        this.art = art;
        this.can = can;
    }

    public Articulo getArt() {
        return art;
    }

    public void setArt(Articulo art) {
        this.art = art;
    }

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }
    
    
}
