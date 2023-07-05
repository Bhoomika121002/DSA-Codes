package hashing;

import java.util.HashSet;
import java.util.Iterator;


public class hashset {
    public static void main(String[] args) {
        
        //creating
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);

        //search -contains
        if(set.contains(1)){
            System.out.println("set contains");
        }
        if(!set.contains(6)){
            System.out.println("doesnot contain");

        }

        //delete - .remove
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("we deleted 1");
        }

        //size
        System.out.println("size of set" + set.size());

        //print all elements
        System.out.println(set);

        //iterator ---symbol iterate 
         // for eg -> for(int i =0; i<n;i++)
         //special iterator 
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());   //sorting is not done // no gurantee of order 
        }
         
        

    }
      
}
