package graph;

import java.util.ArrayList;

public class dfs {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){
        boolean vis[] = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i =0; i<V; i++){      // this this for the nodes not visted yet because of no connection 
            if(!vis[i]){
                dfs(i, adj, vis, ans);
            }
        }
        
        dfs(0, adj, vis, ans);

        return ans; 
    }
     
public void dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean vis[], ArrayList<Integer> ans){
    vis[v] = true;    //vertex not visited yet 
    ans.add(v);
    //neighbour for loop 
    for(Integer neighbor:adj.get(v)){
        if(!vis[neighbor]){
            dfs(neighbor, adj, vis, ans);
        }
    }
}}
