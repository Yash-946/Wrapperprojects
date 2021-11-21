import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionAssignment1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("Enter an integer: ");
            int a = s.nextInt();
            System.out.println("Enter an integer: "+a);
            int b = a*a;
            System.out.println("The square of value is: "+b);
            System.out.println("The work has been done successfully.");
        }
        catch (InputMismatchException obj)
        {
//            System.out.println("Enter an integer: "+a);
            System.out.println("Entered input is not a valid format for integer");
        }
    }
}
