package Graphs.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair>{
    int wt;
    int v;
    Pair(int v, int wt){
        this.v =v;
        this.wt=wt;
    }
    public int compareTo(Pair that){    //on basis of weight compare 
        return this.wt-that.wt; 

    }
}
public class dijakstra {
    static int spanningtree(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj){ // 3rd arraylist defines the weigh
        boolean[] vis = new boolean[v];
        PriorityQueue<Pair> q = new PriorityQueue<>();

        //ans array in stating infinite values 
        int S = 0;
        q.add(new Pair(S,0));
        int ans[] = new int[v];
        Arrays.fill(ans, 10000000);
        ans[S] =0;   //source = 0
        while(q.size()!=0){    //queue is empty 
            Pair cur=q.remove();

            int u=cur.v;
            if(vis[u]){
                continue;
            }
            
            vis[u] = true;

            ArrayList<ArrayList<Integer>> neighbors = adj.get(u);

            for(ArrayList<Integer> list:neighbors){
                int vertex = list.get(0);
                int wt = list.get(1);

                if(ans[vertex] > ans[u] +wt){
                    ans[vertex] = ans[u] +wt;
                    q.add(new Pair(vertex,ans[vertex]));
                }
                    
                }
            }
            return ans; 

    }
    
}
