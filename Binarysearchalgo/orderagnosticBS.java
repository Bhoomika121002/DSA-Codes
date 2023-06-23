package Binarysearchalgo;

public class orderagnosticBS {
    public static void main(String[] args) {
        //int[] arr = {1,2,5,6,78,89,90}; // array in ascending order 
        int[] arr = {90,87,76,65,54,53,32,2,1};
        int target =  53;
        int ans = orderagnosticBS(arr,target);
        System.out.println(ans);
    }
    static int orderagnosticBS(int[] arr, int target){
        int start = 0;
            int end = arr.length -1;

            //find whether  the array is sorted in ascending or descending
            boolean isASC = arr[start] < arr[end];

            while(start<=end){
                //find the mid element
                //int mid = (start+end) /2 ;
                //int has fixed size //might be possible that start+end exceeds the range of error 
                int mid = start + (end - start) /2;

                if(arr[mid]==target){
                    return mid;
                }

                if(isASC){
                    if(target < arr[mid]){
                        end = mid -1;
                    }else if(target > arr[mid]){
                        start = mid + 1;

                    }
                }else{
                    if(target > arr[mid]){
                        end = mid -1;
                    }else if (target < arr[mid]){
                        start = mid +1;
                    }
                }
            }
            return -1;

        

    }
    
}
