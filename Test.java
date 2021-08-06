package Grafos;

public class Test {
    public static void main(String[] args) {
        // Ejercicio1();
        Ejercicio4();
    }

    public static void Ejercicio1() {
        Grafo<String> grafin = new Grafo<String>(30);
        grafin.add("data");
        grafin.add("data1");
        grafin.add("data2");
        grafin.add("data2");
        grafin.add("data3");
        grafin.addArista("data", "data1");
        grafin.addArista("data", "data1");

        System.out.println(grafin.getVertice("data").toString());
        grafin.impListaAdyacencia();

    }

    public static void Ejercicio4() {
        Grafo<String> E4 = new Grafo<String>(30);
        E4.addWord("words");
        E4.addWord("cords");
        E4.addWord("corps");
        E4.addWord("coops");
        E4.addWord("crops");
        E4.addWord("drops");
        E4.addWord("drips");
        E4.addWord("grips");
        E4.addWord("gripe");
        E4.addWord("grape");
        E4.addWord("graph");
        E4.impListaAdyacencia();
    }

    public static void Ejercicio3() {
        Grafo<String> E3 = new Grafo<String>(30);

    }

}
