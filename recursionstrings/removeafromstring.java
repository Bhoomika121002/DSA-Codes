package recursionstrings;

public class removeafromstring {
    public static void main(String[] args) {
        skip("","baccdah");
    }

    //p = processed & up = unprocessed
    static void skip(String p, String up){
        if(up.isEmpty()){      //base condition 
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if(ch=='a'){
            skip(p,up.substring(1));
        }else{
            skip(p+ch,up.substring(1));
        }
    }


    //return a string
    static String skip2(String up){
        if(up.isEmpty()){      //base condition 
            return "";
        }
        char ch = up.charAt(0);

        if(ch=='a'){
            return skip2(up.substring(1));
        }else{
            return ch + skip2(up.substring(1));

            //current con
        }
    }
     
}
