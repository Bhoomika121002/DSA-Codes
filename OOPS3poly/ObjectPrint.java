package OOPS3poly;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }
//provided with 2 string method 
    @Override   //actuallt extends defalut 2 string at runtime decide which method to call at runtime  
    public String toString() {
        return "ObjectPrint [num=" + num + "]";
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);

        System.out.println(obj);  //println taking obj inside it and calling tostring function 
    }
    
}

//firstly checks for the tostring method if not created then used default tostring of obj class -- results hashcode 
//hashcode result 