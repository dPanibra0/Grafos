package Grafos;

public class Vertice<E extends Comparable<E>> {
    protected E data;
    private int numAristas = 0;
    protected Arista[] listAristas;

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

    public void addArista(Arista a) {
        if (!this.inList(a)) {
            this.listAristas[numAristas] = a;
            numAristas++;
        }
    }

    public boolean inList(Arista a) {
        if (numAristas == 0)
            return false;

        for (int i = 0; (listAristas[i] != null) && (i < listAristas.length); i++) {
            if (a.getSiguiente().data.compareTo(listAristas[i].getSiguiente().data) == 0) {
                System.out.println("La arista ya se encuentra en " + this.data);
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String resp = "";
        for (int i = 0; (listAristas[i] != null) && (i < listAristas.length); i++) {
            resp += listAristas[i].siguiente.getData().toString() + " : " + listAristas[i].getPeso() + "\n";
        }
        return this.data+ " Adyacentes:\n" +resp;
    }
}
