
import java.util.ArrayList;


public class Revista{
        
    private int edicion;
    private int nA;
    private String titulo1;
    private String titulo2;
    private String titulo3;
    private int nP;
    private int cal;

    public Revista(int edicion, int nA, String titulo1, String titulo2, String titulo3, int nP, int cal) {
        this.edicion = edicion;
        this.nA = nA;
        this.titulo1 = titulo1;
        this.titulo2 = titulo2;
        this.titulo3 = titulo3;
        this.nP = nP;
        this.cal = cal;
    }
    public Revista() {
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public int getnA() {
        return nA;
    }

    public void setnA(int nA) {
        this.nA = nA;
    }

    public String getTitulo1() {
        return titulo1;
    }

    public void setTitulo1(String titulo1) {
        this.titulo1 = titulo1;
    }

    public String getTitulo2() {
        return titulo2;
    }

    public void setTitulo2(String titulo2) {
        this.titulo2 = titulo2;
    }

    public String getTitulo3() {
        return titulo3;
    }

    public void setTitulo3(String titulo3) {
        this.titulo3 = titulo3;
    }


    public int getnP() {
        return nP;
    }

    public void setnP(int nP) {
        this.nP = nP;
    }

    public int getCal() {
        return cal;
    }

    public void setCal(int cal) {
        if(cal>=0 && cal<=10){
          this.cal = cal;    
        }
        
    }
    
    
    
}
