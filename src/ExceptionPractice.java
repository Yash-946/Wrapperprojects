import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
//            System.exit(0);
            int a = s.nextInt();
            int b = s.nextInt();
            int []arr = {122,45,67,89,98};
            int index = s.nextInt();
            System.out.println(a / b);  //arithmeticException
            System.out.println(arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException|IllegalArgumentException|
                ArithmeticException| InputMismatchException obj)
        {
            System.out.println(obj);
        }
//        catch (ArrayIndexOutOfBoundsException obj)
//        {
//            System.out.println(obj);
//        }
//        catch (IllegalArgumentException obj)
//        {
//            System.out.println(obj);
//        }
//        catch (ArithmeticException obj)   //Handler
//        {
//            System.out.println(obj);
//        }
//        catch (Exception obj)
//        {
//            System.out.println(obj);
//        }
        finally
        {
            System.out.println("inside the finally block");
        }
        System.out.println("end of the main");
    }
}
