public class Node {

    private String value;
    private Node nextNode;

    public String getValue (){
        return value;
    }

    public Node getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(Node node) {
        this.nextNode = node;
    }

    Node(String value) {
        this.value = value; }


    public Node insertNodeAtPosition(Node newNode, int position) {

        if (position == 0) { return newRoot(newNode); }
        if (position == getListSize()) { return append(newNode); }

        Node previousNode = getNodeAtPosition(position-1);
        newNode.setNextNode(previousNode.getNextNode());
        previousNode.setNextNode(newNode);
        return this;
    }

    private Node getNodeAtPosition(int position) {
        Node walker = this;
        for (int i=0; i<position; i++) {
            walker = walker.getNextNode();
        }
        return walker;
    }

    private Node append(Node node) {
        Node lastNode = getNodeAtPosition(getListSize()-1);
        lastNode.setNextNode(node);
        return this;
    }

    private Node newRoot(Node newRoot) {
        newRoot.setNextNode(this);
        return newRoot;
    }

    private int getListSize() {
        int listSize = 1;
        Node walker = this;
        while (walker.getNextNode() != null) {
            walker = walker.getNextNode();
            listSize++;
        }
        return listSize;
    }

    public void print() {
        Node walker = this;
        System.out.print("[" + this.value + "] ");
        while (walker.getNextNode() != null) {
            walker = walker.getNextNode();
            System.out.print("[" + walker.value + "] ");
        }
    }
}