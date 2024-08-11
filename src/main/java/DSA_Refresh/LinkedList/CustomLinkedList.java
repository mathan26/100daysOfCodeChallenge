package DSA_Refresh.LinkedList;

public class CustomLinkedList {

    // head node
    Node head;
    Node tail;

    int size=0;

    public void insertAtFront(int newData) {
        // 1. allocate new node
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;

        // to assign tail to the end of the list
        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void insertAtLast(int newData) {
        // condition check
        if( tail == null ) {
            insertAtFront(newData);
            return;
        }
        Node newNode = new Node(newData);
        // make link
        tail.next = newNode;
        // Move the tail to the last node
        tail  = newNode;
        size++;

    }


    public void insert(int data, int index) {
        if (index == 0) {
            insertAtFront(data);
        }

        if (index == size) {
            insertAtLast(data);
        }


        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(data, temp.next);

        temp.next = newNode;
        size++;

    }

    public int deleteFirst() {
        int value = head.value;
        head = head.next;

        if(head == null) {
            tail = null;
        }
        size--;

        return value;
    }

    public  int deleteLast() {
        if(size <=1){
            return deleteFirst();
        }
        Node secondLast = getNode(size-2);
        int deletedValue = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return deletedValue;
    }

    public int delete(int index) {
        if(index == 0){
            return deleteLast();
        }

        if (index == size-1){
           return deleteLast();
        }

        Node prev = getNode(index-1);
        int deletedValue = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return deletedValue;

    }

    public  Node getNode(int index) {
        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return  temp;
    }

    public int getCurrentSize() {
        return size;
    }

    public void display() {
        Node tempNode = head;

        while (tempNode != null) {
            System.out.print(tempNode.value+" ->");
            tempNode = tempNode.next;
        }
        System.out.println("END");
    }




    // Node contains data field and reference link to next node
    private class Node {
        private int value;
        private Node next;

        public Node() {
        }

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
