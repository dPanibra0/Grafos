package Grafos;

public class Test {
    public static void main(String[] args) {
        Grafo<String> grafin = new Grafo<String>(30);
        grafin.add("data");
        grafin.add("data1");
        grafin.add("data2");
        grafin.add("data2");
        grafin.add("data3");
    }
}
