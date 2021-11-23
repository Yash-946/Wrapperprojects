public class Test1 {
    public static void main(String[] args) {
//        Integer obj = 20;
        Integer obj = Integer.valueOf(60);
        Integer obj1 = Integer.valueOf(60);
        System.out.println(obj.equals(obj1));
        System.out.println(obj== obj1);
        Test1 obj3 = new Test1();
        Test1 obj4 = new Test1();
        System.out.println(obj3== obj4);
        int a= obj.intValue(); //unboxing
        Integer i1 = 78;
        int i2 = i1;


//        int a = 20;
//        try
//        {
////            System.exit(0);
////            throw new ArithmeticException("/  by  zero");
//            System.out.println(a / 0);  //arithmetic exception
//        }
//        catch (ArithmeticException obj)  //handler
//        {
//            System.out.println(obj);
//        }
//        finally {
//            System.out.println("inside finally block");
//        }
//        System.out.println("end of the main");


//        int []arr = new int[Integer.MAX_VALUE];  //Error
    }
}
