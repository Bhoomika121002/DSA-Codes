package LinkedList;

public class Main {
    public static void main(String[] args) {
    //     LinkedList<Integer> list = new LinkedList<>();
    //     list.add(34);    // this is one way of adding value in the linkedlist we have to look at how the addition is being done
   
            // LL list = new LL();
            // list.insertFirst( 3);
            // list.insertFirst (2);
            // list.insertFirst(8);
            // list.insertFirst(17);
            // list.insertLast(99);
            // list.insert(100, 3);
            // System.out.println(list.deleteFirst());
            // list.display();
            // System.out.println(list.deleteLast());
            // list.display();
            // System.out.println(list.delete(2));
            // list.display();


    //         DLL list = new DLL();
    //         list.insertFirst( 3);
    //         list.insertFirst (2);
    //         list.insertFirst(8);
    //         list.insertFirst(17);
    //         list.insertlast(99);
    //         list.insert(8, 65);
    //         list.display();
    // }

    CLL list = new CLL();
    list.insert(23);
    list.insert(3);
    list.insert(19);
    list.insert(75);
    list.delete(19);
    
    list.display();

}
}