package one.DIO;

public class Node<T> {
    private T conteudo;
    private Node<T> nextNode;
    private Node<T> prevNode;

    public Node(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public Node<T> getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(Node<T> prevNode) {
        this.prevNode = prevNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "conteudo=" + conteudo +
                '}';
    }
}
