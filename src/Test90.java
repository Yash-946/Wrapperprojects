//class Mythread90 implements Runnable{
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("mythread90 "+i);
//        }
//    }
//}
public class Test90 {
    public static void main(String[] args) {
//        Mythread90 obj = new Mythread90();
//        Thread obj2 = new Thread(obj);     // main code
//        Thread obj2 = new Thread(new Mythread90());
          Thread obj2 = new Thread(() -> System.out.println("hello"));
        obj2.start();
        for (int i = 0; i < 2; i++) {
            System.out.println("main thread "+i);
        }
    }
}
