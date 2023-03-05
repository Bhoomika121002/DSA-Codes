import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1:
            System.out.println("Kunal kushwaha");
            break;
            case 2:
            System.out.println("emp 3");
            switch (department) {
            case "IT":
                System.out.println("IT Department");

            break;
            case "Management":
                System.out.println("Management Department");
            break;
            default:
            System.out.println("No Department");
        }
        break;
    default:
    System.out.println("no employee");

        
    }
}
}
