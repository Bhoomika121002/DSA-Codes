public class Shadowing {
     static int x =90;  // this willl be shadowed at line 6     // initialized in this block so will be avaliable in this block with everyone
     public static void main(String[] args){
            System.out.println(x);  //90
            int x = 40;  //the class variable at line 2 is shadowed by this
            
            // int x;
            // System.out.println(x); //scope will begin when value is initialized
            // x=40;
            
            System.out.println(x);  //40
            fun();

     }
     static void fun() {
        System.out.println(x);
     }
}
