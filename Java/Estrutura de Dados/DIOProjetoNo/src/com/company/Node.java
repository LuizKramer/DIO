package com.company;

public class Node {
    private String conteudo;
    private Node nextNode;

    public Node(String conteudo) {
        this.nextNode = null;
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
