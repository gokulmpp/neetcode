package array;

public class LinkedList {
    Node head;
   /*
    class Node{
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
           head = newNode;
           return;
        }

        newNode.next= head;
        head = newNode;
    }*/
    class Node {
        int data;
         Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
   }
   void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
   }

   void addLast(int data) {
        Node newNode = new Node(data);//create a new node of the current node
        //if the list is empty
        if(head == null) {
            head = newNode;
            return;
        }
        //traverse to the end of the list
       Node current = head;
        while(current.next !=null) {
            current = current.next;
        }
        current.next = newNode;
   }
   //Add a node at a  specific position
    void addAtPosition(int data,int position) {
        if(position == 0) {
            addFirst(data);
            return;
        }
        //create the new node
        Node newNode = new Node(data);
        Node current = head;

        //Traverse to the node just before the desired position
        for(int i=0;i<position-1 && current.next!=null;i++) {
            current = current.next;
        }

        //check is the position is out of bounds
        if(current == null) {
            System.out.println("position is out of bounds");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;

    }
    void printList() {
        Node current = head;
        while(current.next!=null) {
            System.out.println(current.data+ " ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);
        list.printList();
    }
}
