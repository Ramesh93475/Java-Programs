class A extends Thread{
    public void run(){
          System.out.println("Thread A Started....");
          for(int i=1;i<=4;i++){
                  System.out.println("From Thread A : i = "+i);
          }
          System.out.println("Exit from A");
    }}
class B extends Thread{
    public void run(){
          System.out.println("Thread B Started....");
          for(int j=1;j<=4;j++){
                  System.out.println("From Thread B : j = "+j);
          }
          System.out.println("Exit from B");
    }}
class C extends Thread{
    public void run(){
          System.out.println("Thread C Started....");
          for(int k=1;k<=4;k++){
                  System.out.println("From Thread C : k = "+k);
          }
          System.out.println("Exit from C");
    }}
class ThreadPriority{
     public static void main(String args[]){
            A a = new A(); 
            B b = new B();
            C c = new C();
            c.setPriority(Thread.MAX_PRIORITY);
            b.setPriority(a.getPriority()+1);
            a.setPriority(Thread.MIN_PRIORITY);
            System.out.println("Start thread A");
            a.start();       
            System.out.println("Start thread B");
            b.start();       
            System.out.println("Start thread C");
            c.start();       
            System.out.println("End of main thread...");}}
class A extends Thread{
    public void run(){
          System.out.println("Thread A Started....");
          for(int i=1;i<=4;i++){
                  System.out.println("From Thread A : i = "+i);
          }
          System.out.println("Exit from A");
    }}
class B extends Thread{
    public void run(){
          System.out.println("Thread B Started....");
          for(int j=1;j<=4;j++){
                  System.out.println("From Thread B : j = "+j);
          }
          System.out.println("Exit from B");
    }}
class C extends Thread{
    public void run(){
          System.out.println("Thread C Started....");
          for(int k=1;k<=4;k++){
                  System.out.println("From Thread C : k = "+k);
          }
          System.out.println("Exit from C");
    }}
class ThreadPriority{
     public static void main(String args[]){
            A a = new A(); 
            B b = new B();
            C c = new C();
            c.setPriority(Thread.MAX_PRIORITY);
            b.setPriority(a.getPriority()+1);
            a.setPriority(Thread.MIN_PRIORITY);
            System.out.println("Start thread A");
            a.start();       
            System.out.println("Start thread B");
            b.start();       
            System.out.println("Start thread C");
            c.start();       
            System.out.println("End of main thread...");}}
