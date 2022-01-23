package one.DIO;

public class BinNode<T extends Comparable<T>> {
    private T content;
    BinNode<T> leftNode;
    BinNode<T> rightNode;

    public BinNode(T content){
        this.content = content;
        this.leftNode = null;
        this.rightNode = null;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public BinNode<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    public BinNode<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinNode<T> rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return "BinNode{" +
                "content=" + content +
                '}';
    }
}
