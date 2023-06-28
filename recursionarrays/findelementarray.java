package recursionarrays;

import java.util.ArrayList;
import java.util.Arrays;

public class findelementarray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,5,6,7};
        System.out.println(find(arr,5,0));
        System.out.println(findIndex(arr,5,0));

        System.out.println(findIndexLast(arr,5,arr.length-1));
        findIndexAll(arr, 5, 0);
        System.out.println(list);

        System.out.println(findIndexAll2(arr,5,0,new ArrayList<>()));

        System.out.println(findIndexAll3(arr,5,0));
    }


    static boolean find ( int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || find(arr,target,index+1);
    }

    //if want to return the index value 
    static int findIndex ( int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{

        return findIndex(arr,target,index+1);
        }
    }

    //search from last
    static int findIndexLast ( int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{

        return findIndexLast(arr,target,index-1);
        }
    }

    //to find all index value 
    static ArrayList<Integer> list = new ArrayList<>();
    static void findIndexAll ( int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);  //when you find the answer add in list
        }
        findIndexAll(arr,target,index+1);
        }

    static ArrayList findIndexAll2 ( int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);  //when you find the answer add in list
        }
        return findIndexAll2(arr,target,index+1,list);
        }

        //return list but don't take argument 
        static ArrayList findIndexAll3 ( int[] arr, int target, int index){
        //at each call create a new arraylist
        ArrayList <Integer> list  = new ArrayList<>();
            if(index == arr.length){
            return list;
        }

        //this will contain anaswer for that function call only 
        if(arr[index] == target){
            list.add(index);  //when you find the answer add in list
        }
        ArrayList<Integer> ansfrombelowcalls = findIndexAll3(arr,target,index+1);   //cals remove from statck
        //indiacte list the function call hve ans add those ans and return collectively  
        list.addAll(ansfrombelowcalls); //list contains all the ans 
        return list;   //return ans from all function calls 
    
    }

    }


