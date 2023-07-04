package Graphs;

import java.util.*;

public class graph {

    //array of linked list 
    private LinkedList<Integer> adj[];

    //constaructor 
    public graph(int v){
        adj = new LinkedList[v];
        for (int i = 0; i<v; i++){
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void addedge(int source, int destination){
        adj[source].add(destination);
        adj[destination].add(source);
    }

    //find min distence between source & destination
    public int bfs(int source, int destination) {

        //all this already contained is the false value 
        boolean vis[] = new boolean[adj.length];
        int parent[] = new int[adj.length];
        Queue<Integer> q = new LinkedList<>();

        q.add(source);
        parent[source] = -1;
        vis[source] = true;    //for not putting the source in queue

        //till q is empty
        while(!q.isEmpty()){
            int cur = q.poll();
            if(cur == destination) break;

            //see neignbours  visit and add
            for(int neighbor: adj[cur]){
                if(!vis[neighbor]){
                    vis[neighbor] = true;
                    q.add(neighbor);
                    parent[neighbor] = cur;
                }
            }
        }

    // traverse in parent until we get -1 value 
        int cur = destination;
        int distance = 0;
        while(parent[cur] != -1) {
            System.out.print(cur+"->");
            cur = parent[cur];
            distance++;
        }
        return distance;
    }

    //recursive function  dfs 
    private boolean dfsUtil(int source, int destination, boolean vis[]){
        //base case handle
        if(source == destination) return true;

        for(int neighbor : adj[source]){
            if(!vis[neighbor]) {
                vis[neighbor] = true; 
                boolean isConnected = dfsUtil(neighbor, destination, vis);
                if(isConnected) return true;
            }
        }
        return false;
    }

    //dfs using stack
    public boolean dfsstack(int source, int destination){
     boolean vis[] = new boolean[adj.length];
        vis[source] = true;
        //stack creation 
        Stack<Integer> stack = new Stack<>();
        stack.push(source);
        while(!stack.isEmpty()){
            int cur = stack.pop();

            if(cur == destination) return true;

            for(int neighbor: adj[cur]){
                if(!vis[neighbor]){
                    vis[neighbor] = true;
                    stack.push(neighbor);
                }

            }
        }
        return false;

    }

    //dfs using recursive stack 

    public boolean dfs(int source, int destination){
        boolean vis[] = new boolean[adj.length];
        vis[source] = true;

        return dfsUtil(source, destination,vis);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices & edges");

        int v = sc.nextInt();
        int e = sc.nextInt();

        graph graph = new graph(v);
        System.out.println("Enter" + e+ "edges");
        for(int i = 0; i<e; i++){
            int source = sc.nextInt();
            int destination = sc.nextInt();
            
            graph.addedge(source, destination);

        }    
        System.out.println("Enter source and destination");

            int source = sc.nextInt();
            int destination = sc.nextInt();


            // int distance= graph.bfs(source,destination);
            // System.out.println("Min distance" + distance);
            System.out.println("possible" + graph.dfsstack(source,destination));
            sc.close();
    } 
}
