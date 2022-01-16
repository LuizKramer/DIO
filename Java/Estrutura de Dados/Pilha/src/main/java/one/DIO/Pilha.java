package one.DIO;

public class Pilha {
    private Node refNodeEntryPilha;

    public Pilha() {
        this.refNodeEntryPilha = null;
    }

    public boolean isEmpty(){
        return (refNodeEntryPilha == null ? true : false);
    }

    public Node top(){
        return refNodeEntryPilha;
    }

    public void push(Node newNode){
        Node auxRef = refNodeEntryPilha;
        refNodeEntryPilha = newNode;
        newNode.setRefNode(auxRef);
    }

    public Node pop() {
        if (!this.isEmpty()) {
            Node poppedNode = refNodeEntryPilha;
            refNodeEntryPilha = refNodeEntryPilha.getRefNode();
            return poppedNode;
        }
        return null;
    }

    @Override
    public String toString() {
        String returnString = "------------" + " Pilha " + "------------\n";
        Node auxNode = refNodeEntryPilha;
        while (true){
            if(auxNode != null){
                returnString += "{" + auxNode.getData() + "}\n";
                auxNode = auxNode.getRefNode();
            }
            else{
                break;
            }
        }
        returnString += "==========================================";
        return returnString;
    }
}
