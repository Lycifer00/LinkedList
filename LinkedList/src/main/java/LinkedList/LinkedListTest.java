package LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {

        MyLinkedList linkedList = new MyLinkedList(10);
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(6);

        linkedList.add(10,3);
        linkedList.add(2,5);
        linkedList.printList();
    }
}
