public class LinkedList {

    private Node root;
    private Node last;
    private int size;

    public void append(Node node) {
        last.setNextNode(node);
        last = node;
        size++;
    }

    public void insertNodeAtPosition(Node node, int position) {
        if (position == 0) insertNewRoot(node);
        else if (position == size) append(node);
        else if (size <= position ) System.out.println("Choose a position for "+ node.getValue() +" within the List\n-------------------------------------");
        else insert(node, position);
    }

    public void print() {
        System.out.println("List Size: [" + size + "]");
        getNode(size, true);
    }

    public LinkedList(Node node)  {
        root = node;
        last = node;
        size = 1;
    }

    private void insertNewRoot(Node node) {
        node.setNextNode(root);
        root = node;
        size++;
    }

    private void insert(Node node, int index) {
        Node targetNode = getNode(index, false);
        node.setNextNode(targetNode.getNextNode());
        targetNode.setNextNode(node);
        size++;
    }

    private Node getNode(int position, boolean shouldPrint)  {

        Node walker = root;

        for (int i=1; i<=position; i++) {
            if (shouldPrint) {
                System.out.print(walker.getValue() + " ");
            }
            walker = walker.getNextNode();
        }


        return walker;
    }
}