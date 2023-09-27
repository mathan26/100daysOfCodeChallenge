package DSA_Refresh.LinkedList;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.insertAtFront(1);
        linkedList.insertAtFront(2);
        linkedList.insertAtFront(3);

        linkedList.insertAtLast(10);

        linkedList.insert(100,2);
        linkedList.display();
        System.out.println("Deleting the first element -> "+linkedList.deleteFirst());
        linkedList.display();

//        System.out.println(linkedList.getCurrentSize());
        System.out.println("Deleting the last element -> "+linkedList.deleteLast());
        linkedList.display();
        System.out.println("Deleting element at index 2 -> "+ linkedList.delete(2));
        linkedList.display();
    }
}
