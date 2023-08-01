package graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class bfs {
    private static boolean bfs(ArrayList<ArrayList<Integer>> adj, int src, int dest, int v, int pred[], int dist[])
    {
        LinkedList<Integer> queue = new LinkedList<Integer>();
        boolean visited[] = new boolean[v];
        for(int i =0; i<v; i++){
            visited[i] = false;    //initial values 
            dist[i] = Integer.MAX_VALUE;    //distance from source 
            pred[i] = -1;     //to reach any node what is the predicessor 
        }

        visited[src] = true; 
        dist[src] = 0; 
        queue.add(src);    //add 1 

        while(!queue.isEmpty()){
            int cur = queue.remove();   //remove 1 now work on the neighbour 
            for (int i =0; i<adj.get(v).size(); i++){
                int neighbor = adj.get(v).get(i);
                if(visited[neighbor] == false){
                    visited[neighbor] = true;
                    dist[neighbor] = dist[cur] +1;
                    pred[neighbor] = cur;
                    queue.add(neighbor);

                    if(neighbor == dest)
                    return true; 
                }
            }
        }
        return false;
    }

    static void main(String[] args){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v =6; 
        int e = 8; 

        int vis[] = new boolean[v+1];
        int pred[] = new int[v+1];
        int dist[] = new int[v+1];

        int isReached = bfs(adj,1,6,v,pred,dist);

        int components =0;

        for(int i =1; i<=v; i++){
            if(!vis[i]) {
                components++;
                bfs(adj,1,6,v,pred,dist,vis);

            }
        }
    }
    
}
