package recursionlevel1;

public class resumdigits {
    public static void main(String[] args) {
        int ans = sum(1342);
        System.out.println(ans);
    }
    static int sum(int n){
        if(n==0){         //here for product is changed n%10 ==n return n 
            return 0;
        }
        return (n%10) + sum(n/10);    //for product just use*
    }

}

