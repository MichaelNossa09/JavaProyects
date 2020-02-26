
package herencia;


public class Egresados extends Persona{
    private int cod;
    private int añodegrado;

    public Egresados() {
    }

    public Egresados(int cod, int añodegrado, String nombre, String apellido, int doc) {
        super(nombre, apellido, doc);
        this.cod = cod;
        this.añodegrado = añodegrado;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getAñodegrado() {
        return añodegrado;
    }

    public void setAñodegrado(int añodegrado) {
        this.añodegrado = añodegrado;
    }
    
  /*  @Override
    public String toString(){
        
    }
*/
}
