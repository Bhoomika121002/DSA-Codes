//find itenary from tickets

package hashing;

import java.util.HashMap;

public class hashingq3 {
    public static void main(String[] args) {
        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");
        
        String start = getStart(tickets);

        while(tickets.containsKey(start)){
            System.out.println(start);
            start = tickets.get(start);
        }
        System.out.println(start);
    }

    public static String getStart(HashMap<String,String> tick){
        HashMap<String,String> revMap = new HashMap<>();
        //key became value & value becomes key 
        for (String key : tick.keySet()){
            //key -> key :val -> tick.get(key)  == in original 
            revMap.put(tick.get(key),key);
        }

        for(String key : tick.keySet()){
            if(!revMap.containsKey(key)){
                return key;    //just for finding the start 
            }
        }
        return null;

    }

    
}
