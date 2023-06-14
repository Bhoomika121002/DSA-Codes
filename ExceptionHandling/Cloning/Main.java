package ExceptionHandling.Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Bhoomika = new Human(22, "Bhoomika");
        //Human twin = new Human(Bhoomika);
    
    //copy one value to the other obj   //faster way to copy // in arrays and string 
        Human twin = (Human)Bhoomika.clone();
        System.out.println(twin.age + " "+ twin.name);
    }

    
}
 