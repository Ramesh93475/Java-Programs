class MyThread extends Thread
{
    public void run()
    {
        int i=1;
        while(i<10)
        {
            System.out.println(i+"Hi");
            i++;
        }
    }
}

class MyRunnable extends Thread{
    public void run()
    {
        int i=1;
        while(i<10)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
}
public class ThreadTest implements Runnable //extends Thread
{
    public void run()
    {
        int i=1;
        while(i<10)
        {
            System.out.println(i+"How");
            i++;
        }
    }
    
    public static void main(String[] args) {
        
        MyThread r=new MyThread();
        MyRunnable p=new MyRunnable(); 
        ThreadTest x=new ThreadTest();
        Thread th=new Thread(x);
        r.start();
        p.start();
        th.start(); 
        try{
        r.sleep(1000);
p.sleep(1000);}
      catch(Exception e){System.out.println(e);}
        
        int i=1;
        while(i<10)
        {
            System.out.println(i+"World");
            i++;
        }        
    }
     
    
}
