package one.DIO;

public class Main {
    public static void main(String[] args) {
        ListaCircular<Integer> listaCircular = new ListaCircular<>();
        listaCircular.add(1);
        listaCircular.add(2);
        listaCircular.add(3);
        listaCircular.add(4);
        listaCircular.add(5);

        System.out.println(listaCircular);

        listaCircular.remove(0);

        System.out.println(listaCircular);

    }
}
