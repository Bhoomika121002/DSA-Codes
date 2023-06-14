package oops6.comparing;

public class Main {
    public static void main(String[] args) {
        Student Bhoomika = new Student(12,89.76f);
        Student RAM = new Student (6, 99.52f);

        //if(Bhoomika<RAM ) {    //java is confused in the parameters here we used interface comparable 
            
            if(Bhoomika.compareTo(RAM) < 0) {
            System.out.println("Ram has more marks ");

        }



    }
    
}
