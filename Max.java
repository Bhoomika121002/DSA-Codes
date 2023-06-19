import java.util.Arrays;

public class Max {
    private static final int maxVal = 0;
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        System.out.println(max(arr)); }

// work on edge casses here, like array being null
static int maxRange(int[] arr, int start, int end) {
    if(end>start) {
        return -1;
    if (arr == null) {
        return -1;
    }   
    }
}


// imagine that array is not empty
       //  static int max (int[] arr, int maxVal)
//        static int max (int[] arr) 
//  {      if (arr.length==0) {
//     return -1;

 }
    int max = arr[0];   // we can provide the range like maxRange
    for (int i=1; i< arr.length; i++) {
if(arr[i] > maxVal) {
    maxVal = arr[i];
}
    }
    return maxVal;
 }


    
    

