package LinkedList;

class MyLinkedList {
    private int numNodes = 0;
    private Node head;

    MyLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }


    }

    void add(int index, Object data){
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1; i++) {
            if (temp.next == null) {
                continue;
            }
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public Node get(int index){
        Node temp=head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

