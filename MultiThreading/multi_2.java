package MultiThreading;
class MyThread extends Thread
//all inbulid thread  calss  extends mythread class
{
    public void run()
    {
        System.out.println("Child class");
    }
}

public class multi_2 
{
    public static void main(String[] args) 
    {
        System.out.println("Main Thread");
        MyThread t = new MyThread();
        t.start();
    }
}
