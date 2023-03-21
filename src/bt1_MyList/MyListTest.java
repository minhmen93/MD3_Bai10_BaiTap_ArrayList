package bt1_MyList;

public class MyListTest {
    public static void main(String[] args) {
    MyList<Integer> myListTest = new MyList<>();
    myListTest.add(6);
    myListTest.add(7);
    myListTest.add(8);
    myListTest.add(9);

        System.out.println(myListTest.size());
        System.out.println(myListTest.get(0));
        System.out.println(myListTest.contains(5));
        System.out.println(myListTest);
        System.out.println(myListTest.indexOf(6));
        myListTest.remove(1);
        System.out.println(myListTest);
        myListTest.clone();
        myListTest.equals(myListTest);
    }

}
