package recursionlevel1;

public class repalindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(1234321));
    }
    // static int sum = 0;
    // static void rev(int n){
    //     if(n==0){
    //         return;
    //     }
    //     int rem = n%10;
    //     sum = sum *10 +rem;
    //     rev(n/10);
    // }
    static int rev(int n) {
            if (n == 0) {
                return 0;
            }
            
            int rem = n % 10;
            int reversed = rev(n / 10);
            
            return reversed * 10 + rem;
        }

    static boolean palindrome(int n) {
        return n == rev(n);

    }
    
}
