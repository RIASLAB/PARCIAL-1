
package libro;


public class Libro {
    
    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int numeroEjemplaresPrestados;
    
    public Libro (String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestado;
    }

    
    public Libro () {
        this.titulo = "";
        this.autor = " ";
        this.numeroEjemplares = 0;
        this.numeroEjemplaresPrestados = 0;
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

    public double getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares ) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public double getNumeroEjemplaresPrestados() {
        return numeroEjemplaresPrestados;
    }

    public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados) {
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

   public boolean prestamo() {
        if (numeroEjemplares > numeroEjemplaresPrestados) {
            numeroEjemplaresPrestados++;
            return true;
        }
        return false;
    }

    public boolean devolucion() {
        if (numeroEjemplaresPrestados > 0) {
            numeroEjemplaresPrestados--;
            return true;
        }
        return false;
    }

     public void imprimir() {
        System.out.println("el titulo del libro es: " + titulo);
        System.out.println("el autor del libro es: " + autor);
        System.out.println("Los numeros de ejemplares que hay son: " + numeroEjemplares );
        System.out.println("Los numeros de ejemplares prestados son: que hay son: " + numeroEjemplaresPrestados);
    }
    
    
    public static void main(String[] args) {
        Libro Libro1 = new Libro("Cien años de soledad", "Jhon Edinson Riascos L", 5,2);
        Libro1.imprimir();
    }
    
}
