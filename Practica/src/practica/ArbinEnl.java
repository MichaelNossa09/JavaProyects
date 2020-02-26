
package practica;

public class ArbinEnl implements Arbin{
    private int dato;
    private Arbin izq;
    private Arbin der;

    public ArbinEnl(int dato) {
        this.dato = dato;
    }
    
    @Override
    public int obtener() {
       return dato;
    }

    @Override
    public Arbin der() {
       return der;
    }

    @Override
    public Arbin izq() {
       return izq;
    }

    @Override
    public void enlDer(Arbin x) {
       der = x;
    }

    @Override
    public void enlIzq(Arbin x) {
       izq = x;
    }

    @Override
    public void modificar(int x) {
       dato = x;
    }
}
