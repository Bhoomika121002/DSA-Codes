package recursionlevel1;

public class refactorial {
    public static void main(String[] args) {
        int ans = refact(5);
        System.out.println(ans);
    }
    static int refact(int n){
        if (n<=1){   //base condition
            return 1;
        }

        return n* refact(n-1);   //in sum instead of multiplication add(+) is used 


    }
    
}
