package one.DIO;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.enqueue(new Node("first"));
        fila.enqueue(new Node("second"));
        fila.enqueue(new Node("third"));
        fila.enqueue(new Node("fourth"));
        System.out.println(fila);
        System.out.println(fila.first());
        fila.deQueue();
        System.out.println(fila);
        System.out.println(fila.first());

    }
}
