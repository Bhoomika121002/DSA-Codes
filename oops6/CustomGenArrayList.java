package oops6;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenArrayList<T> {

    private Object[] data;
    private int Default_size = 10;
    private int size = 0; //also working as index value 

    public CustomGenArrayList() {
        this.data = new Object [Default_size];
    }
 
    public void add(T  num) {
        if(isFull()) {
            resize();
        }

        data[size++] = num;  
    }

    

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        //copy the current items in the new array
        for (int i = 0; i <data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull(){
        return size == data.length;
    }

    //remove returns the value that is remove 
    public T remove(){
        T removed = (T)data[--size];  //IN SMALLER TYPE YOU ARE TRYING TO ADD BIGGER TYPE USE CASTING 
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;

    }

    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList [data=" + Arrays.toString(data) + ", Default_size=" + Default_size + ", size=" + size
                + "]";
    }

    public static void main(String[] args) {
         //ArrayList list = new ArrayList();
        //  CustomArrayList list = new CustomArrayList();
        // //  list.add(3);
        // //  list.add(5);
        // //  list.add(9);     //ans size 3

        //  for (int i=0; i<14; i++){
        //     list.add(2*i);   //ans size 14
        //  }

        //  System.out.println(list);
        

        ArrayList<Integer> list = new ArrayList<>();
        CustomGenArrayList<Integer> list2 = new CustomGenArrayList<>();
        for (int i=0; i<14; i++){
            list2.add(2*i);   //ans size 14   //gives empty value as null 
          }

        System.out.println(list2);
    }
   
    
    
}
