class DoublyLinkedList {
    //A node class for doubly linked list
    class Node{
        int item;
        Node previous;
        Node next;

        public Node(int item) {
            this.item = item;
        }
    }
    Node head, tail = null;

    public void addNode(int item) {
        //Create a new node  
        Node newNode = new Node(item);

        if(head == null) {
            head = tail = newNode;
            head.previous = null;
            //tail's next will be null  
            tail.next = null;
        }
        else {
            tail.next = newNode;
            //newNode->previous set to tail  
            newNode.previous = tail;
            //newNode becomes new tail  
            tail = newNode;
            //tail's next point to null  
            tail.next = null;
        }
    }

    //print all the nodes of doubly linked list
    public void printNodes() {
        //Node current will point to head  
        Node current = head;
        if(head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while(current != null) {
            //Print each node and then go to next.  
            System.out.print(current.item + " ");
            current = current.next;
        }
    }
}