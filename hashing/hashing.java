package hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class hashing {
    static class HashMap<K,V> {  //generics  , parametrized types key type --- don't know now so use generics 
        private class Node{
            K key;
            V value;
        
        public Node(K key, V value){
            this.key = key;
            this.value = value;
        }

    }
    private int n; //no. of nodes
    private int N; // no. of buckets
    //buckets type array contains linkedlist 
    private LinkedList<Node> buckets[];   //hashmap

    public HashMap(){
        this.N = 4;     //buckets
        this.buckets = new LinkedList[4];    //at every bucket new empty linkedlist created 
        for(int i = 0; i<4; i++){
            this.buckets[i] = new LinkedList<>();
        }
        //earlier at every array null is stored need to create the linkedlist --- empty LL 
    }

    private int hashFunction(K key) {
        int bi = key.hashCode();
        //any value 2345-1-3
        return Math.abs(bi) % N;   //-ve value to +ve 
        
    }
    private int searchInLL(K key, int bi) {
        LinkedList<Node> ll = buckets[bi];
        int di = 0;
        for(int i =0; i<ll.size();i++){
            if(ll.get(i).key==key){    //node's key matches with the key 
                return i;   //di
            }
        }
        return -1;
    }
     private void rehash() {
        //current bucket stored someehere then new bucket created 
        LinkedList<Node> oldbuckets[] = buckets;
        buckets = new LinkedList[N*2];    //double size

        for(int i =0; i<N*2; i++){
            buckets[i] = new LinkedList<>();   //check ll is empty or have elements
        }
        for (int i = 0; i<oldbuckets.length;i++){
            LinkedList<Node> ll = oldbuckets[i];
            for ( int j =0; j<ll.size(); j++){
                Node node = ll.get(j);
                put(node.key,node.value);

            }
        }

    }

    public void put(K key, V value){
        //bucket index find to know whether key exits already or new to create 
        int bi = hashFunction(key);
        int di = searchInLL(key,bi);   //data index --- LL index 
        //di = 0 key not exists
        //if di = any no key exists 
        if(di == -1) {  //key not exists
            buckets[bi].add(new Node(key,value));  //new node added
            n++;
        } else{ //key exists 
            Node node = buckets[bi].get(di);
            node.value = value;
        }
        double lambda = (double)n/N;
        if(lambda > 2.0){
            //rehashing
            rehash(); 
        }
    }

    public V get(K key){
         int bi = hashFunction(key);
        int di = searchInLL(key,bi);
        if(di == -1) {  //key not exists
            return null;
        } else{ //key exists 
            Node node = buckets[bi].get(di);
            return node.value;
        }
    }

    public boolean containskey(K key){
         int bi = hashFunction(key);
        int di = searchInLL(key,bi);
        if(di == -1) {  //key not exists
            return false;
        } else{ //key exists 
           return true;
        }

    }
    public V remove(K key){
        int bi = hashFunction(key);
        int di = searchInLL(key,bi);
        if(di == -1) {  //key not exists
            return null;
        } else{ //key exists 
            Node node = buckets[bi].remove(di);
            n--;
            return node.value;
       }
    }

    public ArrayList<K> keySet(){
        ArrayList<K> keys = new ArrayList<>();

        for(int i =0; i<buckets.length; i++){  //bi
            LinkedList<Node> ll = buckets[i];
            for(int j =0; j<ll.size();j++){  //di
                Node node = ll.get(j);
                keys.add(node.key);

            }
        }
        return keys;
    }

    public boolean isEmpty(){
        return n ==0;

    }
    }


    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();   //created own class
        map.put("India",120);
        map.put("US",100);
        map.put("China",150);  
        
        ArrayList<String> keys = map.keySet();
       for(int i =0; i< keys.size(); i++){
        System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
       }
       map.remove("India");
       System.out.println(map.get("India"));
    }
}
    

