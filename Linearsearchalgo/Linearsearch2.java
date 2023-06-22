package Linearsearchalgo;

public class Linearsearch2 {
    public static void main(String[] args) {
        int[] nums = {23,45,1,2,8,19,-3,16,11};
        int target = 2;
        boolean ans = linearsearch(nums, target);
        System.out.println(ans);
    }
//search in the array: return the index if item found
//otherwise if item not found return -1
    static boolean linearsearch(int[] arr, int target){
        if(arr.length ==0){
        return false;
    }
//run a loop
    for(int index =0; index<arr.length;index++){
        //check whether element exists or not 
        int element = arr[index];     //in returning the elemnt this could be int element:arr
        if (element == target){
        return true;    //for returning the element just write return element here 
    }
    
}

//this line will execute if none of the return statemnets above have execute 
//hence the target not found 
    return false;}}
