package Grafos;

public class Arista {
    protected Vertice siguiente;
    protected double peso;

    public Arista() {
    }

    public Arista(Vertice siguiente) {
        this.siguiente = siguiente;
        this.peso = 1;
    }

    public Arista(Vertice siguiente, double peso) {
        this.siguiente = siguiente;
        this.peso = peso;
    }


    public Vertice getSiguiente() {
        return this.siguiente;
    }

    public void setSiguiente(Vertice siguiente) {
        this.siguiente = siguiente;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}