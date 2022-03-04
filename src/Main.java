public class Main {

    public static void main(String[] args) {

        LinkedList firstList = new LinkedList(new Node("B"));

        firstList.append((new Node("E")));
        firstList.append((new Node("F")));

        firstList.insertNodeAtPosition(new Node("A"), 0);
        firstList.insertNodeAtPosition(new Node("C"), 1);
        firstList.insertNodeAtPosition(new Node("D"), 2);
        firstList.insertNodeAtPosition(new Node("G"), 6);
        firstList.insertNodeAtPosition(new Node("N"), 16);


        firstList.print();
    }
}