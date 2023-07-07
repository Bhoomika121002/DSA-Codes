//kth largest element in an array

package Heaps;

import java.util.PriorityQueue;

public class kthlargest {
    public static void main(String[] args) {
       int[] a = {20,10,60,30,50,40};
        int k = 3;
       System.out.println(kthlargest(a,3));
    }
    static int kthlargest(int[] a, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0; i<k; i++){
            pq.add(a[i]);
        }
        for(int i=k; i<a.length;i++){
            if(pq.peek() < a[i]){
                pq.poll();
                pq.add(a[i]);
            }
        }
        return pq.peek();

    }
    
}
