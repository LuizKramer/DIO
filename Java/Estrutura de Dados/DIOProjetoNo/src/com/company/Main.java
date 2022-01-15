package com.company;

public class Main {

    public static void main(String[] args) {
	    Node<String> node1 = new Node<>("Conteudo no1");
        Node<String> node2 = new Node<>("Conteudo no2");

        node1.setNextNode(node2);

        Node<String> node3 = new Node<>("Conteudo no3");
        node2.setNextNode(node3);

        Node<String> node4 = new Node<>("Conteudo no4");
        node3.setNextNode(node4);

        System.out.println(node1);
        System.out.println(node1.getNextNode());
        System.out.println("-----");
        System.out.println(node1);
        System.out.println(node1.getNextNode());
        System.out.println(node1.getNextNode().getNextNode());
        System.out.println(node1.getNextNode().getNextNode().getNextNode());
        System.out.println(node1.getNextNode().getNextNode().getNextNode().getNextNode());


    }
}
