package one.DIO;

public class Main {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        fila.enqueue(4);
        System.out.println(fila);
        System.out.println(fila.first());
        fila.deQueue();
        System.out.println(fila);
        System.out.println(fila.first());

    }
}
