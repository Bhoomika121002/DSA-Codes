//union & intersection of 2 arrays 
package hashing;

import java.util.HashSet;

public class hashing2q {
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        System.out.println(unionarrays(arr1,arr2));
        System.out.println(intersection(arr1,arr2));
    }

    public static int unionarrays(int arr1[],int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int j =0; j<arr2.length; j++){
            set.add(arr2[j]);
        }
        return set.size(); 
    }

    public static int intersection(int arr1[], int arr2[]){
        int count =0;
        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int j =0; j<arr2.length; j++){
            
            if(set.contains(arr2[j])){
                count++;
                set.remove(arr2[j]);
            }
    }
    return count;  //intersection elements 
    
}}
