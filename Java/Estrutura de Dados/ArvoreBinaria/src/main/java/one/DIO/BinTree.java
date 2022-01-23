package one.DIO;

public class BinTree<T extends Comparable<T>> {
    private BinNode<T> root;

    public BinTree(){
        this.root = null;
    }


    private BinNode<T> insert(BinNode<T> atual, BinNode<T> newNode){
        if(atual == null){
            return newNode;
        }
        else if(newNode.getContent().compareTo(atual.getContent()) < 0 ){
            atual.setLeftNode(insert(atual.getLeftNode(), newNode));
        }else{
            atual.setLeftNode(insert(atual.getRightNode(), newNode));
        }
        return atual;
    }

    public void insert(T content){
        BinNode<T> newNode = new BinNode<>(content);
        this.root = insert(this.root, newNode);
    }
}
