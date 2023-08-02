package Graphs.graph;

import java.util.ArrayList;

public class directed {
    public boolean cyclic(int V, ArrayList<ArrayList<Integer>> adj){
    boolean vis[] = new boolean[V];
    boolean recS[] = new boolean[V]; //recursion stack

    for (int i =0; i<V; i++){
        if (!vis[i]){
            if(dfs(i, adj, vis, recS)) return true; 
        }

    }
    return false;
    }
    public boolean dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean vis[], boolean resC[]){
        vis[v] = true;    //vertex not visited yet 
       resC[v] = true; 

       for(Integer neighbor:adj.get(v)){
        if(!vis[neighbor]){
            if(dfs(neighbor, adj, vis, recS))
            return true;
        }
        else if(resC[neighbor]){
            return true;           //cycle present  
        }
    }
    resC[v] = false;    
    return false;
    }
       }

