package staticExample;

public class Main {
    public static void main(String[] args) {
        // Human Bhoomika = new Human(22, "Bhoomika", 100000, false );
        // Human Kunal = new Human(34, "Kunal", 150000, false );

        // System.out.println(Kunal.name);
        // System.out.println(Bhoomika.population);
        // System.out.println(Kunal.population);

     //   greeting();  // inside stsic we cnnnot use that is not static
    }

    //static void greeting
    void greeting() {
        System.out.println("Hello world");
    }

    static void fun() {
        
        // i am referenving here , get an obj
        Main obj = new Main();
        obj.greeting(); 
        
        //greeting(); 
    }
    
}
