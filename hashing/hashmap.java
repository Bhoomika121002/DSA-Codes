package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {
        //country key, population value
        HashMap<String, Integer>  map = new HashMap <>();
    
        //insertion
        map.put("India",120);
        map.put("US",30);

        System.out.println(map);

        map.put("India",130); 

        //lookup & search
        if(map.containsKey("India")){
        System.out.println("present in the map");
        } else {
        System.out.println("key is not present in map");
        }

        System.out.println(map.get("India"));

        //loop
        //for(value:collection)   // collection bunch of values 
        //ist way simple 
        int arr[] = {12,15,18};

        for(int i = 0; i<3; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();

        //2nd method 
        for(int val : arr){
            System.out.println(val +"");
        }
        System.out.println();

        //for(int  val : arr){
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());  


        }

        //another way
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" "+map.get(key));
        }

        //remove value
        map.remove("US");
        System.out.println(map);
    

     }
        



}




    
    
    
