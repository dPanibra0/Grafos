package Grafos;

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

    public Vertice<E> getVertice(E data) {

        for (int i = 0; (listVertices[i] != null) && (i < listVertices.length); i++) {
            if (data.compareTo(listVertices[i].getData()) == 0) {
                return listVertices[i];
            }
        }
        return null;

    }

    public void addArista(E from, E to) {
        Vertice f = this.getVertice(from);
        Vertice t = this.getVertice(to);
        Arista a = new Arista(t);
        f.addArista(a);
    }

    public void addArista(E from, E to, double peso) {
        Arista a = new Arista(this.getVertice(to), peso);
        this.getVertice(from).addArista(a);
    }

    public void addArista(Vertice<E> from, Vertice<E> to, double peso) {
        Arista a = new Arista(to, peso);
        from.addArista(a);
    }

    public void addArista(Vertice<E> from, Vertice<E> to) {
        Arista a = new Arista(to);
        from.addArista(a);
    }

    public Vertice<E> searchVertice(E data) {
        return null;
    }

    public boolean inGrafo(E data) {
        if (numVertice == 0) {
            return false;
        }
        for (int i = 0; (listVertices[i] != null) && (i < listVertices.length); i++) {
            if (data.compareTo(listVertices[i].data) == 0)
                return true;
        }
        return false;
    }

    public void impListaAdyacencia() {
        if (numVertice == 0)
            return;

        String line = "";
        for (int i = 0; (listVertices[i] != null) && (i < listVertices.length); i++) {
            line = listVertices[i].data+"-> ";
            Arista[] listA=listVertices[i].getlistAristas();
            for (int j = 0; (listA[j] != null) && (j < listA.length); j++) {
                line+=listA[j].siguiente.data.toString() + ":" +listA[j].peso+"; ";
            }
            System.out.println(line);
        }
    }
}