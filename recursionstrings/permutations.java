package recursionstrings;

import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        permutations("","abc");
        
        ArrayList<String> ans = permutationslist("","abc");
        System.out.println(ans);
    }
    static void permutations(String p, String up){
        if(up.isEmpty()){      //base condition 
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        //earlier fixed function calls i.e 2 ... but here their is variable function calls 

        for (int i =0; i<= p.length(); i++){
             String f = p.substring(0,i);
             String s = p.substring(i, p.length());
             permutations(f+ch+s,up.substring(1));
        }   
    }
    static ArrayList<String> permutationslist(String p, String up){
        if(up.isEmpty()){      //base condition 
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
            
        }
        char ch = up.charAt(0);
        //earlier fixed function calls i.e 2 ... but here their is variable function calls 

        //local to this call 
        ArrayList<String> ans = new ArrayList<>();

        for (int i =0; i<= p.length(); i++){
             String f = p.substring(0,i);
             String s = p.substring(i, p.length());
             ans.addAll(permutationslist(f+ch+s,up.substring(1)));
        } 
        return ans;  
    }
}
