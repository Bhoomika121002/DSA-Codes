//connect n ropes with min cost 

package Heaps;

import java.util.PriorityQueue;

public class nropesmincost {
    public static void main(String[] args) {
        int[] a = {2,5,4,8,6,9};
        System.out.println(cost(a)); 
    }

    static int cost(int[] a){
        PriorityQueue<Integer> pq = new PriorityQueue<>() ; //min heap
        for(int i=0; i<a.length; i++){
            pq.add(a[i]);
        }
        int ans=0;
        while(pq.size() >1){  //atleat 2 elemnet remaining
            int first = pq.poll();   //min number 
            int second = pq.poll();
            int sum = first + second;
            ans+=sum;
            pq.add(sum);

        }
        return ans;
    }

    
}
