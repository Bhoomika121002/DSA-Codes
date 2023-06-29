package recursionstrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetiteration {
    public static void main(String[] args) {
        //int[] arr = {1,2,3};
        int[] arr = {1,2,2};
        List<List<Integer>> ans = subsetduplicate(arr);
        //List<List<Integer>> ans = subset(arr);
        for(List<Integer> list : ans){  //for every list in answer print that list  
            System.out.println(list);
        }
    
    }

    //return list of list integer 
    static List<List<Integer>> subset(int[] arr){
        //outer list is main arraylist
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num : arr) {
            int n  = outer.size();
            for(int i = 0; i<n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));   //constructor is created    

                internal.add(num); 
                outer.add(internal);  //individual list added to main list
            }    
        }
        return outer;
    }

    //for the duplicates {1,2,2}
   static List<List<Integer>> subsetduplicate(int[] arr){
    //sort the arrays
        Arrays.sort(arr);
        //outer list is main arraylist
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;
        for(int i = 0; i<arr.length;i++) {
            start = 0;
            //if current and previous element is same  s = e+1

            if(i> 0 && arr[i] == arr[i-1]){
                start = end +1 ;
            }
            end = outer.size() -1;

            int n  = outer.size();
            for(int j = start; j<n; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));   //constructor is created    

                internal.add(arr[i]); 
                outer.add(internal);  //individual list added to main list
            }    
        }
        return outer;
    }
}
