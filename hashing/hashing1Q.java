//majority element 

package hashing;

import java.util.HashMap;

public class hashing1Q {

    public static void majorityElement(int nums[]){   //work is to print all the majority element
        HashMap<Integer,Integer> map = new HashMap<>();
        //form key value pairs
        int n = nums.length;
        for(int i = 0; i<n; i++){
            if(map.containsKey(nums[i])){    //key exists
                map.put(nums[i], map.get(nums[i]) +1);
            } else{   //false
                map.put(nums[i],1);
            }
        }

        for(int key : map.keySet()){  //traverse over the set 
            if(map.get(key) > n/3){
                System.out.println(key);
            }

        }
    }
    public static void main(String[] args) {
        int nums[] = {1,3,2,5,1,3,1,5,1};    //1
        majorityElement(nums); 
    }
    
}
