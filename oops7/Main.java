package oops7;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();   //list is parent and arraylist is child 
        //can also be linked list 
    
    
        list.add(6);
        list.add(5);

        System.out.println(list);


        //vector impl ementation
        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(67);

        System.out.println(vector);
    
    }
    
}
