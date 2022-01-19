package one.DIO;

public class ListaDuplamenteEncadeada<T> {
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int listSize;

    public ListaDuplamenteEncadeada(){
        listSize = 0;
        firstNode = null;
        lastNode = null;
    }

    public int size(){
        return this.listSize;
    }

    public T get(int index){
        return this.getNode(index).getConteudo();
    }

    public void add(T conteudo){
        Node<T> newNode = new Node<>(conteudo);
        newNode.setNextNode(null);
        newNode.setPrevNode(this.lastNode);
        if(this.firstNode == null){
            this.firstNode = newNode;
        }
        if (this.lastNode != null){
            this.lastNode.setNextNode(newNode);
        }
        this.lastNode = newNode;
        this.listSize++;
    }

    public void add(int index, T conteudo){
        Node<T> auxNode = getNode(index);
        Node<T> newNode = new Node<>(conteudo);
        newNode.setNextNode(auxNode);

        if(newNode.getNextNode() != null){
            newNode.setPrevNode(auxNode.getPrevNode());
            newNode.getNextNode().setPrevNode(newNode);
        }
        else{
            newNode.setPrevNode(this.lastNode);
            this.lastNode = newNode;
        }

        if(index == 0){
            this.firstNode = newNode;
        }
        else{
            newNode.getPrevNode().setNextNode(newNode);
        }
        this.listSize++;
    }

    public void remove(int index){
        if(index == 0){
            this.firstNode = this.firstNode.getNextNode();
            if(this.firstNode != null){
                firstNode.setPrevNode(null);
            }
        }
        else{
            Node<T> auxNode = getNode(index);
            auxNode.getPrevNode().setNextNode(auxNode.getNextNode());
            if(auxNode != this.lastNode){
                auxNode.getNextNode().setPrevNode(auxNode.getPrevNode());
            }
            else{
                this.lastNode = auxNode;
            }
        }
        this.listSize--;
    }

    private Node<T> getNode(int index){
        Node<T> auxNode = firstNode;
        for(int i = 0; (i < index) && (auxNode != null); i++){
            auxNode = auxNode.getNextNode();
        }
        return auxNode;
    }

    @Override
    public String toString(){
        String str = "";
        Node<T> auxNode = this.firstNode;
        for(int i = 0; i < size(); i++){
            str += "[Node{conteudo=" + auxNode.getConteudo() +"}] -> ";
            auxNode = auxNode.getNextNode();
        }
        str += "null";
        return str;
    }
}
