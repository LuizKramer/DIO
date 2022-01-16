package one.DIO;

public class Fila {
    private Node refEntryNode;

    public Fila() {
        this.refEntryNode = null;
    }

    public boolean isEmpty(){
        return refEntryNode == null ? true : false;
    }

    public void enqueue(Node newNode){
        newNode.setRefNode(refEntryNode);
        refEntryNode = newNode;
    }

    public Node deQueue(){
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
            return firstNode;
        }
        return null;
    }


    public Node first(){
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
            return auxNode;
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
