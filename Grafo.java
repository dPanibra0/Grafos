package Grafos;

/**
 * Grafo
 */
public class Grafo<E extends Comparable<E>> {
    int numVertice;
    int maxVertices;
    Vertice<E>[] listVertices;

    public Grafo(int maxVertices) {
        this.listVertices = new Vertice[maxVertices];
        this.maxVertices = maxVertices;
        this.numVertice = 0;
    }

    public void add(E data) {
        if (numVertice == maxVertices - 1) {
            System.out.println("El Grafo esta lleno");
        } else if (this.inGrafo(data)) {
            System.out.println(data.toString() + " ya se encuentra en el Grafo");
        } else {
            Vertice<E> v = new Vertice<E>(data, maxVertices);
            this.listVertices[numVertice] = v;
            numVertice++;
        }
    }

    public Vertice<E> searchVertice(E data) {
        return null;
    }

    public boolean inGrafo(E data) {
        if (numVertice == 0) {
            return false;
        }
        for (int i = 0; (listVertices[i] != null ) && (i<listVertices.length) ; i++) {
            if (data.compareTo(listVertices[i].data) == 0)
                return true;
        }
        return false;
    }
}