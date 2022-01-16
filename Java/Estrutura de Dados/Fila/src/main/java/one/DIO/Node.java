package one.DIO;

public class Node {
    private Object object;
    private Node refNode;

    public Node() {
    }

    public Node(Object object) {
        this.object = object;
        this.refNode = null;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Node getRefNode() {
        return refNode;
    }

    public void setRefNode(Node refNode) {
        this.refNode = refNode;
    }

    @Override
    public String toString() {
        return "Node{" +"object=" + object +'}';
    }
}
