package sortingalgo;

import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    //not taking the cpy .. which part is array we are working 
    static void sort(int[] nums, int low, int high){
        if (low>= high) {
            return;
        }

        //start from low and end high strat and end = swapping

        int s = low;
        int e = high;
        int m = s+(e-s)/2;
        int pivot = nums[m];

        while(s<=e){

            //this check can be violated 
            while(nums[s] < pivot){
                s++;    //no violation
            }
            while(nums[e]>pivot){
                e--;
            }//whenever the condition violate 
            if (s<=e) {    //maybe the condition we are checking is being violated 
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            
            
            }
        }

        //now pivot is at correct index please sort 2 halfs 
        sort(nums,low,e);
        sort(nums,s,high);


    }
    
}
