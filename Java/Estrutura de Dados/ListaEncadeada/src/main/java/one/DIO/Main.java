package one.DIO;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();
        listaEncadeada.add(1);
        listaEncadeada.add(2);
        listaEncadeada.add(3);
        listaEncadeada.add(4);
        System.out.println(listaEncadeada);
        System.out.println(listaEncadeada.size());
        System.out.println("get: " + listaEncadeada.get(2));
        System.out.println(listaEncadeada);
        listaEncadeada.remove(0);
        System.out.println(listaEncadeada);
    }
}
