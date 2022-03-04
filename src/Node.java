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

}