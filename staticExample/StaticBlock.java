package staticExample;

// this is demo for initialization of static variables



public class StaticBlock {
    static int a = 4;
    static int b;
  // will run only once, when the first obj is created i.e when the class is loaded for running
    static {
        System.out.println("Iam in static block");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);


    }
    
}
