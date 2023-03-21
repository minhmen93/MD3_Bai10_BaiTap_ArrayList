package bt2_LinkedLisst;

import javax.xml.soap.Node;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", data=" + data +
                    '}';
        }
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(Object data) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(data);
        numNodes++;

    }

    public Object remove(int index) {
        Node temp = head;
        Node holder;
        Node result;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        result = temp;
        holder = temp.next.next;
        temp.next = holder;
        numNodes--;
        return result;
    }

    public Object clone() {
        Node newList = new Node(head.data);
        Node temp = head;
        newList.next = temp.next;
        return newList;
    }

    public boolean contains(Object data) {
        Node temp = head;
        Node checkValue = new Node(data);
        while (!temp.data.equals(checkValue.data) && temp.next != null) {
            temp = temp.next;
        }
        if (temp.data == checkValue.data) {
            return true;
        }
        return false;
    }

    public int indexOf(Object data) {
        int index = 0;
        Node temp = head;
        Node checkValue = new Node(data);
        while (!temp.data.equals(checkValue.data) && temp.next != null) {
            temp = temp.next;
            index++;
        }
        if (temp.data == checkValue.data) {
            return index;
        } else {
            return 0;
        }
    }

    public boolean remove(Object data) {
        Node removeValue = new Node(data);
        Node temp = head;
        Node holder;
        while (temp.data != removeValue) {
            temp = temp.next;
        }
        holder = temp.next.next;
        temp.next = holder;
        numNodes--;
        return true;
    }

    public int size() {
        return ++numNodes;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println("Hiển thị ra toàn bộ danh sách liên kết " + temp.data);
            temp = temp.next;
        }
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                ", numNodes=" + numNodes +
                '}';
    }
}
