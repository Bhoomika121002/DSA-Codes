package Graphs.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class topological {
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj){
        boolean vis[] = new boolean[V];
        Stack<Integer> atack= new Stack<>();

        for (int i =0; i<V; i++){
            if (!vis[i]){
                dfs(adj, i, stack, vis);
            }
    
        }
        int ans[] = new int[V];
        int i = 0; 
        while(!Stack.isEmpty()){   //until stack is empty // element is poped 

            ans[i++] = stack.pop();
        }
        return ans;
    }


    //kahn's algo
    int inDeg[] = new int[V];
    for(ArrayList<Integer> list: adj) {   //for every element check in the adajency list 
        for(Integer e: list) {
            inDeg[e]++; 

        }
    }
    boolean vis[] = new boolean[V];
    ArrayList<Integer> ansList = new ArrayList<>();

    bfs(adj, V, 0, vis, ansList, inDeg);

    int ans[] = new int[V];
    int i=0;
    for(int e: ans){
        ans[i++] =e;
    }
    return ans; 
}
    static void bfs(ArrayList<ArrayList<Integer>> adj, int V, int v, boolean vis[], ArrayList<Integer> ans, int inDeg[]){
        Queue<Integer> q = new LinkedList<>();
        for(int i =0; i<V; i++){
            if(inDeg[i] == 0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int cur = q.poll();
            ans.add(cur);

            for(int neighbor: adj.get(cur)){
                if(--inDeg[neighbor] ==0){
                    q.add(neighbor);
                }
            }
        }

    }


    static void dfs(ArrayList<ArrayList<Integer>> adj, int v, Stack<Integer> stack, boolean[] vis){
        vis[v] = true;

        for(int neighbor:adj.get(v)){
             if(!vis[neighbor]){
                dfs(adj, neighbor, stack, vis);
             }    
        }
        stack.push();
    }


}
