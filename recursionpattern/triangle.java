package recursionpattern;

import java.util.Arrays;

public class triangle {
    public static void main(String[] args) {
        triangle(4,0);
        triangle2(4,0);

        int[] arr= {3,1,5,4,2};
        //bubble(arr, arr.length-1,0);
        selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

    static void triangle(int r, int c){
        if (r == 0){
            return;
        }
        if(c<r){
            System.out.print("*");
            triangle(r,c+1);
        } else{
            System.out.println();
            triangle(r-1,0);
        }
    }
    static void triangle2(int r, int c){
        if (r == 0){
            return;
        }
        if(c<r){
            
            triangle2(r,c+1);
            System.out.print("*");
        } else{
            triangle2(r-1,0);
            System.out.println();
            
        }
    }
    static void bubble(int[] arr, int i, int j){
        if (i == 0){
            return;
        }
        if(j<i){    //c<r
            if (arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }  
            bubble(arr,i,j+1);    
        } else{
            bubble(arr,i-1,0); 
        }
    }
    static void selection(int[] arr, int i, int j,int max){
        if (i == 0){
            return;
        }
        if(j<i){    //c<r
            if (arr[j] > arr[max]){
                selection(arr, i, j+1, j);
            }  else{
                selection(arr, i, j+1, max);
            }    
        } else{   //swap the max value you have with the last element
            int temp = arr[max];
            arr[max] = arr[i-1];
            arr[i-1] = temp;

            selection(arr,i-1,0,0);
        }
    }
    
}
