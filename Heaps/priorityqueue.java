package Heaps;

import java.util.PriorityQueue;

public class priorityqueue {
    public static void main(String[] args) {
       PriorityQueue<Integer> pq = new PriorityQueue<>() ;
        pq.add(5);
        pq.add(15);
        pq.add(10);
        System.out.println(pq.size());
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.poll(); 
        }
    }
    
}
