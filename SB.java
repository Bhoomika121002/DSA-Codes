public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i< 26; i++){
            char ch = (char)('a' + i);
            builder.append(ch);  // changimg in the original object // mutable 
            // we can do many things using builder 
        }

        System.out.println(builder.toString()); 
        
        builder.deleteCharAt(0);
        System.out.println(builder);
        
    }
    
}
