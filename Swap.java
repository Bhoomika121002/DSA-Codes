import java.util.ArrayList;
import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18, 56};
        //swap(arr,1,3);  // 1 & 3 are the index 
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    //reverse the array // start and end stsrt increased by 1 while end decremented by 1 and swapping of digits simultaneously
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr. length-1 ;  // last index less by 1
        while(start<end){
            swap(arr, start, end);  //swap
            start++;
            end --;
        }

    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
