package Graphs.graph;

import java.util.ArrayList;

class Edge implements Comparable<Edge>{  //edges compare 
    int src, dest, wt; 

    Edge(int src, int dest, int wt){
        this.src = src;
        this.dest = dest;
        this.wt=wt;
    }

    public int compareTo(Edge that){
        return this.wt-that.wt;
    }
}

public class kruskalsalgo {

    static int p[], rank[];

    static void  union(int x, int y){
        int rx = find(x);
        int ry = find(y);
        if(rx == ry) return;
        p[ry] = rx;
    }
    static int find (int x){
        if(p[x] == x) return x;
        return find(p[x]);
    }

    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj){
        boolean added[][] = new boolean[V][V];
        ArrayList<Edge> edges = new ArrayList<>();

        for(int i=0; i<adj.size(); i++){
            for(int j=0; j<adj.get(i).size(); j++){
                ArrayList<Integer> cur = adj.get(i).get(j);
                if(!added[i][cur.get(0)]){
                    added[i][cur.get(0)] = true; 
                    added[cur.get(0)][i] = true; 
                    edges.add(new Edge(i,cur.get(0), cur.get(1)))

                }
            }
        }
        p = new int[V];
        for(int i =0; i<V; i++){
            p[i] =i;
        }

        Collections.sort(edges);    //edges sort beacause edge implement comaparable   
        int count =1; 
        int ans =0;

        for(int i =0; count<V; i++){   //traverse in the edges 
            Edge edge = edges.get(i);
            int rx = find(edge.src);   //representative of source 
            int ry = find(edge.dest);

            if(rx != ry){   //both in different set take them to 1 set   // if equal then do nothng  

                union(rx,ry);
                count++;
                ans += edge.wt;

            }

        }
        return ans; 
    
    
    }
    
}
