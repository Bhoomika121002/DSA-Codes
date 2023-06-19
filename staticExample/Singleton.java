package staticExample;

public class Singleton {
    private Singleton () {

    }

    private static Singleton instance;


    // run & crete a single obj and when more obj are refereerd to create obj 2 it creates refernce of single obj, it returns the inst6ance you created 
    public static Singleton getInstance() {

        if ( instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


    //main methond 
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
// all 3 refernce variables pointing to 1 obj 
    }


     
    
}
