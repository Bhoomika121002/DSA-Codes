package sortingalgo;

import java.util.Arrays;

public class mergesortusingrecursion {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        System.out.println(Arrays.toString(mergesort(arr)));
    }

    static int[] mergesort(int[] arr) {
        //base condition length array = 1 return arr because no division
        if(arr.length ==1){
            return arr; 
        }

        //take mid and divide 
        int mid = arr.length/2;

        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }

    //becuse we want to  retun an array use array as return type 
    private static int[] merge(int[] first, int[] second) {
        //create new array
        int[] mix = new int[first.length + second.length];

        //take 2 variable i & j for traversing 
        int i = 0;
        int j = 0;
        int k = 0;   //new array 

        //check both condition till loop terminate 
        while(i<first.length && j< second.length){   //untill anyone runs out of bound

            if(first[i] <= second[j]){
                mix[k] = first[i];  //store
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++; //everytime add lement move ahed 
        }
            //it may be possible that one array not complete
            //copy remaining element 
            while(i<first.length){
                mix[k] = first[i];
                i++;
                k++;
            }//from both the while loops one is true 
            while(j<second.length){
                mix[k] = second[j];
                j++;
                k++;
            } 
            return mix;
        }
    }
    

