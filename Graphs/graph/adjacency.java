package Graphs.graph;

import java.util.ArrayList;

public class adjacency {
    public static void main(String[] args) {
        int v = 5;
        int e = 10;

        //adjacency matrix
        int a[][] = new int[v+1][v+1];

        //adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<=v; i++){
            adj.add(new ArrayList<Integer>());

        }
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 3, 4);
        addEdge(adj, 4, 5);
        addEdge(adj, 5, 1);
        addEdge(adj, 5, 2);
        addEdge(adj, 5, 3);
        addEdge(adj, 5, 4);
        

    }
    static void addEdge(int a[][], int source, int dest){
        a[source][dest] =1;
        a[dest][source] =1;
    }
    
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int source, int dest) {
        adj.get(source).add(dest);
        adj.get(dest).add(source);
    }
}
