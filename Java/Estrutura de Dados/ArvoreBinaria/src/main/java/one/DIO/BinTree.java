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
            atual.setRightNode(insert(atual.getRightNode(), newNode));
        }
        return atual;
    }

    public void insert(T content){
        BinNode<T> newNode = new BinNode<>(content);
        this.root = insert(this.root, newNode);
    }

    public void remove(T content){
        try{
            BinNode<T> atual = this.root;
            BinNode<T> fatherNode = null;
            BinNode<T> sonNode = null;
            BinNode<T> tempNode = null;

            while(atual != null && !atual.getContent().equals(content)){
                fatherNode = atual;
                if (content.compareTo(atual.getContent()) < 0){
                    atual = atual.getLeftNode();
                }
                else{
                    atual = atual.getRightNode();
                }
            }

            if (atual == null){
                System.out.println("Content does not exist on this binary tree. Try block");
            }
            if(fatherNode == null){
                if(atual.getRightNode() == null){
                    this.root = atual.getLeftNode();
                }
                else if(atual.getLeftNode() == null){
                    this.root = atual.getRightNode();
                }
                else{
                    for(tempNode = atual, sonNode = atual.getLeftNode();
                    sonNode.getRightNode() != null;
                    tempNode = sonNode, sonNode = sonNode.getLeftNode() ){
                        if(sonNode != atual.getLeftNode()){
                            tempNode.setRightNode(sonNode.getLeftNode());
                            sonNode.setLeftNode(this.root.getLeftNode());
                        }
                    }
                    sonNode.setRightNode(this.root.getRightNode());
                    this.root = sonNode;
                }

            }
            else if(atual.getRightNode() == null){
                if(fatherNode.getLeftNode() == atual){
                    fatherNode.setLeftNode(atual.getLeftNode());
                }
                else{
                    fatherNode.setRightNode(atual.getLeftNode());
                }
            }
            else if(atual.getLeftNode() == null){
                if(fatherNode.getRightNode() == atual){
                    fatherNode.setLeftNode(atual.getRightNode());
                }
                else{
                    fatherNode.setRightNode(atual.getRightNode());
                }
            }
            else{
                for(
                        tempNode = atual, sonNode = atual.getLeftNode();
                        sonNode.getRightNode() != null;
                        tempNode = sonNode, sonNode = sonNode.getRightNode()
                ){
                    if(sonNode != atual.getLeftNode()){
                        tempNode.setRightNode(sonNode.getLeftNode());
                        sonNode.setLeftNode(atual.getLeftNode());
                    }
                    sonNode.setRightNode(atual.getRightNode());

                    if (fatherNode.getLeftNode() == atual){
                        fatherNode.setLeftNode(sonNode);
                    }
                    else{
                        fatherNode.setRightNode(sonNode);
                    }
                }
            }

        }
        catch (NullPointerException error){
            System.out.println("Content does not exist on this binary tree. Catch block");
        }
    }

    private void showInOrder(BinNode<T> atual){
        if(atual != null){
            showInOrder(atual.getLeftNode());
            System.out.print(atual.getContent() + ",");
            showInOrder(atual.getRightNode());
        }
    }

    public void showInOrder(){
        System.out.println("\nIn order:");
        showInOrder(this.root);
    }

    private void showPostOrder(BinNode<T> atual){
        if(atual != null){
            showPostOrder(atual.getLeftNode());
            showPostOrder(atual.getRightNode());
            System.out.print(atual.getContent() + ",");
        }
    }

    public void showPostOrder(){
        System.out.println("\nPost order:");
        showPostOrder(this.root);
    }

    private void showPreOrder(BinNode<T> atual){
        if(atual != null){
            System.out.print(atual.getContent() + ",");
            showPreOrder(atual.getLeftNode());
            showPreOrder(atual.getRightNode());
        }
    }

    public void showPreOrder(){
        System.out.println("\nPre order:");
        showPreOrder(this.root);
    }
}
