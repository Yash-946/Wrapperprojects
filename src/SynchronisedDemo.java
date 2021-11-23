class Account{
    int balanceamount;
    public Account()
    {
        balanceamount = 10000;
    }
    public synchronized void withdraw(int amt){
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        balanceamount = balanceamount-amt;
        System.out.println(balanceamount);
    }
}
class Mythread extends Thread{
    Account obj = null;
    public Mythread(Account t1){
        obj = t1;
    }
    public void run(){
        obj.withdraw(500);
    }
}
public class SynchronisedDemo {
    public static void main(String[] args) {
        Account a1 = new Account();
        Mythread obj1 = new Mythread(a1);
        Mythread obj2 = new Mythread(a1);
        Mythread obj3 = new Mythread(a1);
        obj1.start();
        obj2.start();
        obj3.start();
    }
}
