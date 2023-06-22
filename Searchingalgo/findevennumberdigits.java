package Searchingalgo;

public class findevennumberdigits {
    class Solution {
    public int findNumbers(int[] nums) {
        int count = 0; 
        for(int num : nums ){ //for every number in numbers
            if(even(num)){
                count++;
            }
        } 
        return count;  
    }
    //function to check whether a number conatains even digits or not
    static boolean even(int num){
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2 ==0){
            return true;
        }
        return false;
    }
    //count number of digits in a number 
    static int digits(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num /10;
        }
        return count; 

    }
}
    
}
