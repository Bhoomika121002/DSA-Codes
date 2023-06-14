package oops7;

import java.time.temporal.WeekFields;

public class Basic {
    enum Week{
        Monday, Tuesday, Wednesday
       
        
        Week(){
            System.out.println("Constructor called for " + this);  
            //internally it is public static final week Monday = new week()
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

        System.out.println(week);  //week.ordinal()  


        for(Week day : Week.values() ){
            System.out.println(day);
        }
    }
    
}
