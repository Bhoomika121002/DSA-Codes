package recursionstrings;

public class removeafromstring {
    public static void main(String[] args) {
        skip("","baccdah");
        System.out.println(skip2("baarfgtah"));
        System.out.println(skipApple("baapplerfgtah"));
        System.out.println(skipAppNotApple("baapplerfgtapph"));
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

    //skip an string 
     static String skipApple(String up){
        if(up.isEmpty()){      //base condition 
            return "";
        }

        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else{
            return up.charAt(0) + skipApple(up.substring(1));

        }
    }
     static String skipAppNotApple(String up){
        if(up.isEmpty()){      //base condition 
            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }else{
            return up.charAt(0) + skipAppNotApple(up.substring(1));

        }
    }
}

