package Linearsearchalgo;

public class Richestcustomer {
    class Solution {
    public int maximumWealth(int[][] accounts) {
        //person = row
        //accounts = col
        int max = 0;
        for(int person =0; person < accounts.length; person++){
            int personsum =0;
            
            for(int account = 0; account < accounts[person].length; account++){
                personsum += accounts[person][account];
            }
                if (personsum > max){
                    max = personsum;
                }
                
            }
            return max;
        }
        
    
}
    
}
