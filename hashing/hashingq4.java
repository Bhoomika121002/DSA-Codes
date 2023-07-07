//subarray sum eual to k 

package hashing;

import java.util.HashMap;

public class hashingq4 {
    public static void main(String[] args) {
        int arr[] = {10,2,-2,-20,10};   //ans 3
        int k = -10;
        HashMap<Integer,Integer> map = new HashMap<>(); //sum,freq

        map.put(0,1); //empty subarray
        
        int ans =0;
        int sum =0;
        for(int j =0; j<arr.length; j++){
            sum+=arr[j];

            if(map.containsKey(sum-k)){
                ans+= map.get(sum-k);  //add freq in the ans

            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum) +1);
            }else{   //key not exit 
                map.put(sum,1);

            }
        }
        System.out.println(ans);

    }
    
}
