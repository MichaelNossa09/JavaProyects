
public class Libro extends ConjuntoLibrosRevistas{
   private String titulo;
   private String autor;
   private int nP;
   private int cal;

    public Libro() {
    }

    public Libro(String titulo, String autor, int nP, int cal) {
        this.titulo = titulo;
        this.autor = autor;
        this.nP = nP;
        this.cal = cal;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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
