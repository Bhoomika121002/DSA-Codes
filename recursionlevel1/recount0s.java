package recursionlevel1;

public class recount0s {
    public static void main(String[] args) {
        System.out.println(count(30204));
    }
    static int count(int n){
        return helper(n,0);
    }

    //special pattern , how to pass number to above calls 
    private static int helper(int n, int c) {
        if (n==0){   //this line hits once 
            return c;
        }

        int rem = n%10;
        if (rem ==0) {
            return helper(n/10,c+1);
        }
         return helper(n/10,c);
    }

    
    
}
