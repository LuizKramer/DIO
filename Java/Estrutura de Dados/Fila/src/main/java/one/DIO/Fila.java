package one.DIO;

public class Fila<T> {
    private Node<T> refEntryNode;

    public Fila() {
        this.refEntryNode = null;
    }

    public boolean isEmpty(){
        return refEntryNode == null ? true : false;
    }

    public void enqueue(T object){
        Node newNode = new Node(object);
        newNode.setRefNode(refEntryNode);
        refEntryNode = newNode;
    }

    public T deQueue(){
        if(!this.isEmpty()) {
            Node firstNode = refEntryNode;
            Node auxNode = refEntryNode;
            while(true) {
                if(firstNode.getRefNode() != null){
                    auxNode = firstNode;
                    firstNode = firstNode.getRefNode();
                }
                else {
                    auxNode.setRefNode(null);
                    break;
                }
            }
            return (T) firstNode.getObject();
        }
        return null;
    }


    public T first(){
        if(!this.isEmpty()) {
            Node auxNode = refEntryNode;
            while(true) {
                if(auxNode.getRefNode() != null){
                    auxNode = auxNode.getRefNode();
                }
                else {
                    break;
                }
            }
            return (T) auxNode.getObject();
        }
        return null;
    }

    @Override
    public String toString(){
        String returnString = "";
        Node auxNode = refEntryNode;

        if(refEntryNode != null) {
            while (true){
                returnString += "[Node{object= " + auxNode.getObject() + "}]--->";
                if(auxNode.getRefNode() != null)
                    auxNode = auxNode.getRefNode();
                else {
                    returnString += "null";
                    break;
                }
            }
        }
        else{
            returnString = "null";
        }
        return returnString;
    }

}
