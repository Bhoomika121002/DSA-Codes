package recursionstrings;

import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
        subsequence("", "abc");
        subsequenceascii("", "abc");
        System.out.println(subsequence2("", "abc"));
        System.out.println(subsequenceasciiarray("", "abc"));
    }

    static void subsequence(String p, String up ){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        //take 1st char and make 2 recursion calls either take it or not 
        char ch = up.charAt(0);
        subsequence(p+ch, up.substring(1));
        subsequence(p, up.substring(1));
        
    }

    static ArrayList<String> subsequence2(String p, String up){
        //empty means all list processed add it in arraylist 
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        //take 1st char and make 2 recursion calls either take it or not 
        char ch = up.charAt(0);
        ArrayList<String> left = subsequence2(p+ch, up.substring(1));
        ArrayList<String> right = subsequence2(p, up.substring(1));
        
        //adding and from base condition and then adding the and from the below calls and returing the list 
        left.addAll(right);
        return left;
    }
    static void subsequenceascii(String p, String up ){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        //take 1st char and make 2 recursion calls either take it or not 
        char ch = up.charAt(0);
        subsequenceascii(p+ch, up.substring(1));
        subsequenceascii(p, up.substring(1));
        subsequenceascii(p+(ch+0), up.substring(1));
    }

    //array that contains all the subsequenceascii
    static ArrayList<String> subsequenceasciiarray(String p, String up){
        //empty means all list processed add it in arraylist 
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        //take 1st char and make 2 recursion calls either take it or not 
        char ch = up.charAt(0);
        ArrayList<String> first = subsequenceasciiarray(p+ch, up.substring(1));
        ArrayList<String> second = subsequenceasciiarray(p, up.substring(1));
        ArrayList<String> third = subsequenceasciiarray(p + (ch+0), up.substring(1));
        //adding and from base condition and then adding the and from the below calls and returing the list 
        first.addAll(second);
        first.addAll(third);
        return first;
    }
    
}
