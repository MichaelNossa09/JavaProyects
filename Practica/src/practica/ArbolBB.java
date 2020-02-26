
package practica;


public class ArbolBB {
    
    Arbin crearArbol(){
        Arbin raiz = (Arbin) new ArbinEnl(12);
        Arbin i1 = (Arbin) new ArbinEnl(11);
        raiz.enlIzq(i1);
        Arbin d1 = (Arbin) new ArbinEnl(13);
        raiz.enlDer(d1);
        raiz.izq().enlIzq(new ArbinEnl(5));
        raiz.der().enlDer(new ArbinEnl(17));
        raiz.izq().izq().enlDer( new ArbinEnl(9));
        raiz.der().der().enlIzq(new ArbinEnl(16));
        raiz.izq().izq().enlIzq(new ArbinEnl(2));
        raiz.der().der().enlDer( new ArbinEnl(24));
        return raiz;
        
    }
    void inOrden(Arbin x){
        if(x!=null){
            inOrden(x.izq());
            System.out.println(" "+x.obtener());
            inOrden(x.der());
        }
    }
    public static void main(String[] args) {
        ArbolBB arbol = new ArbolBB();
        Arbin raiz = arbol.crearArbol();
        arbol.inOrden(raiz);
        System.out.println(" ");
        arbol.mayores15(raiz);
        
    }
    public void mayores15(Arbin x){
        Arbin y = x;
        if(x!=null){
            do{
                
                
            }while(x.obtener()<=12);
                
    }
}
    }
