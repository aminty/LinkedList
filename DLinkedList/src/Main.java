public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dlist = new DoublyLinkedList();
        //Add nodes to the list
        dlist.addNode(10);
        dlist.addNode(20);
        dlist.addNode(30);
        dlist.addNode(40);
        dlist.addNode(50);

        //print the nodes of DoublyLinkedList
        dlist.printNodes();
    }
}
