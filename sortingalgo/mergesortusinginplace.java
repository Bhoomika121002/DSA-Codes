package sortingalgo;

import java.util.Arrays;

public class mergesortusinginplace {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        mergesort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergesort(int[] arr,int s, int e) {
        //base condition length array = 1 return arr because no division
        if(e-s ==1){
            return; 
        }

        //take mid and divide 
        int mid = (s+e)/2;

        mergesort(arr, s, mid);
        mergesort(arr, mid,e);

        merge(arr,s,mid,e);
    }

    //becuse we want to  retun an array use array as return type 
    private static void merge(int[] arr, int s, int m, int e) {
        //create new array
        int[] mix = new int[e-s];

        //take 2 variable i & j for traversing 
        int i = s;
        int j = m;
        int k = 0;   //new array 

        //check both condition till loop terminate 
        while(i<m && j< e){   //untill anyone runs out of bound

            if(arr[i] <= arr[j]){
                mix[k] = arr[i];  //store
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++; //everytime add lement move ahed 
        }
            //it may be possible that one array not complete
            //copy remaining element 
            while(i<m){
                mix[k] = arr[i];
                i++;
                k++;
            }//from both the while loops one is true 
            while(j<e){
                mix[k] = arr[j];
                j++;
                k++;
            } 
            
            //modify the original array
            for(int l = 0; l< mix.length; l++){
                arr[s+l] = mix[l];
            }
        }
    }
    

