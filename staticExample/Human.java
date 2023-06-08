package staticExample;

public class Human {

    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message() {
        System.out.println("Hello message");
        //System.out.println(this.age); // not possible static cannot use non static cannot use obj
    }
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;

        Human.message();// this is correct way 
    }

    
    
    }


    
    

