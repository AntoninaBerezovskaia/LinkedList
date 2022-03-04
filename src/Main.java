public class Main {

    public static void main(String[] args) {

        LinkedList firstList = new LinkedList(new Node("D"));

        firstList.append((new Node("E")));
        firstList.append((new Node("F")));

        firstList.insertNodeAtPosition(new Node("A"), 0);
        firstList.insertNodeAtPosition(new Node("B"), 1);
        firstList.insertNodeAtPosition(new Node("C"), 2);
        firstList.insertNodeAtPosition(new Node("D"), 3);
        firstList.insertNodeAtPosition(new Node("G"), 7);


        firstList.print();
    }
}