package a;

public class question {
    public static void main(String[] args) {
        int[] arr = {2,4,3,5,4,2};
        System.out.println(value(arr));
    }

    static int value(int[] arr){
        for (int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if (count ==1){
                return arr[i];
            }
        }
        return -1;
    }
}
