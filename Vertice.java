package Grafos;

public class Vertice<E extends Comparable<E>> {
    E data;
    Arista[] listAristas;

    public Vertice(E data, int maxVertices) {
        this.data = data;
        this.listAristas = new Arista[maxVertices];
    }

    public E getData() {
        return this.data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Arista[] getlistAristas() {
        return this.listAristas;
    }

}
