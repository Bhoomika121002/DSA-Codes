package ExceptionHandling.Cloning;

public class Human implements Cloneable{
    int age;
    String name;
    private int[] arr;
    
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human(Human other){
        this.age = other.age;
        this.name = other.name;
    }


    //specify exception mandatory
    public Object clone() throws CloneNotSupportedException{
        //return super.clone();

        Human twin = (Human)super.clone(); // thiis is actually shallow copy 

        //make a deep copy

        twin.arr = new int[twin.arr.length];
        for(int i = 0; i< twin.arr.length; i++){
           twin.arr[i] = this.arr[i]; 
        }

        return twin;
    }
    
    
}
