public class oops1 {
    public static void main(String[] args) {
        
        Student Bhoomika = new Student(13,  "Bhoomika",  88.5f );
        Student kunal = new Student();

        //Bhoomika.greeting();
        //Bhoomika.changeName(newName:"CUTE");
        
        System.out.println(Bhoomika.rno);
        System.out.println(Bhoomika.name);
        System.out.println(Bhoomika.marks);

        Student random = new Student(); 
        System.out.println(random.name);

    }
}

class Student{
        int rno;
        String name;
        float marks;
    
    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String newName) {
        this.name = newName;
    }

    Student (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
    Student() {
        this.rno = 13;
        this.name = "Bhoomika";
        this.marks = 88.5f;
    }


    // Student arpit = new Student(17, "Arpit" 86.5f);
    // here, this will be replaces with arpit
    Student (int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;

    }

}





