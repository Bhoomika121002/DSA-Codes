package sortingalgo;

import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for(int i =0; i<arr.length; i++){
            //find max item in remqaining array ans swap with correct index
            int last = arr.length -i -1;      //in case of 
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);

        }

    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp; 
    }
    private static int getMaxIndex(int[] arr, int start, int end){
        int max = start;

        for(int i = start; i<= end; i++){
            if (arr[max]<arr[i]){
                max = i;
            }

        }
        return max;

    }





    
        }
        


