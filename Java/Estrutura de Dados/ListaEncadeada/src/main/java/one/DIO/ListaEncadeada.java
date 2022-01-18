package one.DIO;

public class ListaEncadeada<T> {

    Node<T> refEntryNode;

    public ListaEncadeada(){
        this.refEntryNode = null;
    }

    public boolean isEmpty(){
        return refEntryNode == null ? true : false;
    }

    public void add(T conteudo){
        Node<T> auxNode;
        Node<T> newNode = new Node<>(conteudo);
        if(this.isEmpty()){
            refEntryNode = newNode;
            return;
        }
        auxNode = refEntryNode;
        for(int i=0; i < this.size() -1; i++){
            auxNode = auxNode.getNextNode();
        }
        auxNode.setNextNode(newNode);
    }

    public T get(int index){
        return getNode(index).getConteudo();
    }

    private Node<T> getNode(int index){
        indexValidation(index);
        Node<T> auxNode = refEntryNode;
        Node<T> returnNode = null;

        for(int i = 0; i < index; i ++){
            returnNode = auxNode;
            auxNode = auxNode.getNextNode();
        }
        return returnNode;
    }

    private void indexValidation(int index){
        if(index >= this.size() || index < 0){
            throw  new IndexOutOfBoundsException("Nao existe conteudo no indice:" + index);
        }
    }

    public int size(){
        int listSize = 0;
        Node<T> auxNode = refEntryNode;
        while(true){
            if(refEntryNode != null){
                listSize++;
                if (auxNode.getNextNode() != null){
                    auxNode = auxNode.getNextNode();
                }
                else{
                    break;
                }
            }
            else{
                break;
            }
        }
        return listSize;
    }

}
