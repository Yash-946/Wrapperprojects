import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        int a = y.nextInt();
        System.out.println("Given Number: "+a);
        String s =Integer.toBinaryString(a);
        System.out.println("Binary equivalent: "+s);
        String s1 = Integer.toOctalString(a);
        System.out.println("Octal equivalent: "+s1);
        String s2 = Integer.toHexString(a);
        System.out.println("Hexadecimal equivalent: "+s2);
    }
}
