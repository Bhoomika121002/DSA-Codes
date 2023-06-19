import java.util.ArrayList;


public class Operators {


    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");    // operator - can't be applied to string 
        System.out.println('a' +3);
        System.out.println((char)('a'+3));    //casting
        System.out.println("a" +1);
        // integer will be converted to integer that will call toString()
        // this is same as after few steps : "a" + "1"

        System.out.println("kunal" +new ArrayList<>());   // output will show initialy array list is empty & then converted to kunal
        System.out.println("kunal" + new Integer(56));   // concatenation 

        // System.out.println(new Integer(56) + new ArrayList<>());  // this statement is showing error because 2 complex value are added without the string and it is not possible. 
        System.out.println(new Integer(56) + "" +  new ArrayList<>());
        
        System.out.println("a" + 'b');   // string + character added 
        
    
    }
}
