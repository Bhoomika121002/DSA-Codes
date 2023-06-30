package recursionstrings;

import java.util.ArrayList;

public class phonepadleetcode {
    public static void main(String[] args) {
        phonepad("","12");
        System.out.println(phonepad2("","12"));
        System.out.println(phonepadcount("","12"));
    }
    static void phonepad(String p, String up) {
            if(up.isEmpty()){      //base condition 
            System.out.println(p);
            return;
        }
        //first digit 
        int digit = up.charAt(0) - '0';  //this will convert '2' into 2 
        for(int i = (digit -1) * 3; i<digit * 3; i++){
            //which character to add
            char ch = (char) ('a' +i);
            phonepad(p+ch, up.substring(1));
        }
    }
    static ArrayList<String> phonepad2(String p, String up) {
            if(up.isEmpty()){      //base condition 
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        //first digit 
        int digit = up.charAt(0) - '0'; 
         //this will convert '2' into 2 
        
        ArrayList<String> list = new ArrayList<>();
         for(int i = (digit -1) * 3; i<digit * 3; i++){
            //which character to add
            char ch = (char) ('a' +i);
            list.addAll(phonepad2(p+ch, up.substring(1)));   //list after every recursion call 
        }
        return list;
    }

    static int phonepadcount(String p, String up) {
            if(up.isEmpty()){      //base condition 
            return 1;
        }

        int count = 0; 
        //first digit 
        int digit = up.charAt(0) - '0'; 
         //this will convert '2' into 2 
        
         for(int i = (digit -1) * 3; i<digit * 3; i++){
            //which character to add
            char ch = (char) ('a' +i);
            count = count + phonepadcount(p+ch, up.substring(1));   //list after every recursion call 
        }
        return count;
    }
    
}
