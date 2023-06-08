package staticExample;

public class InnerClasses {
    
    // it doesnot depend on the object of this class
    // class test will show error but static wil bot show error 
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return name;
        }

        
        
         
    }

    public static void main(String[] args) {
        Test a = new Test("Bhoomika");
        Test b = new Test("kUNAL");


        System.out.println(a);
        // System.out.println(a.name);
        // System.out.println(b.name);
    }
}
