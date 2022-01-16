package one.DIO;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.push(new Node(1));
        pilha.push(new Node(2));
        pilha.push(new Node(3));
        pilha.push(new Node(4));
        pilha.push(new Node(5));
        System.out.println(pilha);
        pilha.pop();
        System.out.println(pilha);
    }
}
