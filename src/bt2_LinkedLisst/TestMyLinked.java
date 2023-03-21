package bt2_LinkedLisst;

public class TestMyLinked {
    public static void main(String[] args) {
        MyLinkedList myLinkedListTest = new MyLinkedList<>(10);
        myLinkedListTest.addFirst(18);
        myLinkedListTest.addFirst(13);
        myLinkedListTest.addFirst(18);
        myLinkedListTest.addFirst(18);
        myLinkedListTest.addLast(14);
        myLinkedListTest.addLast(15);
        myLinkedListTest.addLast(116);
        myLinkedListTest.addLast(17);
//        myLinkedListTest.addLast(18);
//        myLinkedListTest.addLast(19);
//        myLinkedListTest.addLast(21);
//        myLinkedListTest.addLast(22);
//        myLinkedListTest.addLast(23);
        System.out.println("In ra contains " +myLinkedListTest.contains(117));
        System.out.println("In ra IndexOf "+  myLinkedListTest.indexOf(10));
        System.out.println("In ra remove " +myLinkedListTest.remove(1));
        myLinkedListTest.clone();

        myLinkedListTest.printList();
        System.out.println("Hiển thị myLinkedListTest " +myLinkedListTest);

    }
}
