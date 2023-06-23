package sortingalgo;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        boolean swapped;
        //run the steps n-1 times 
        for (int i = 0; i < arr.length; i++){
            swapped = false;
            //for each step max item come at the last respective index j pointer 
            for(int j = 1; j< arr.length -i; j++){   //last elements fixed 
                //swap if item is smaller then previous item 
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;

                }
            }
            //if didnot swap for particular value of i, it means the array is sorted hence stop
        if (!swapped){
            break; //!false = true 
        }
        }
        

    }
    
}
