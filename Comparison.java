public class Comparison {
    public static void main(String[] args) {
        String a = "kunal";
        String b = "kunal";   //string pool 
        String c = a;   // will give true 

        System.out.println(c==a);  // this will give true
        String name1 = new String ("Bhoomika");
        String name2 = new String ("Bhoomika");

        // System.out.println(name1==name2);     // here different objects created it will false 
        System.out.println(name1.equals(name2));   // it just care about the value 
        System.out.println(name1.charAt(0));    // it will print he letter B 

    }
}
