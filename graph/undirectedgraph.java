package graph;

import java.util.ArrayList;

public class undirectedgraph{
    public ArrayList<Integer> isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        boolean vis[] = new boolean[V];

        for(int i =0; i<V; i++){
            if(!vis[i]){
                if(dfs(i,adj,vis,-1)) return true; 
            }
        }
        return false;
    
    }
    public boolean dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean vis[], int parent){
        vis[v] = true;    //vertex not visited yet 
       
    for(Integer neighbor:adj.get(v)){
        if(!vis[neighbor]){
            if(dfs(neighbor, adj, vis, v))
            return true;
        }
        else if(parent != neighbor){
            return true;           //cycle present  
        }
    }
    return false;   
    }
}
