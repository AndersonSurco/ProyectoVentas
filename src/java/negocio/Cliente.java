
package negocio;

public class Cliente {
    private String dni,nom,dir;

    public Cliente() {
    }

    public Cliente(String dni, String nom, String dir) {
        this.dni = dni;
        this.nom = nom;
        this.dir = dir;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }
    
    
}
