class Syn
{
 synchronized public void display(String s)
     {
        for(int i=0;i<s.length();i++)
         {
             System.out.print(s.charAt(i));
         }
     }
}
class T1 extends Thread
{
   Syn s;
   public T1(Syn s)
     {
       this.s=s;
     }
   public void run()
    {
      s.display("Ramesh hi");
    }
}
class T2 extends Thread
{
   Syn s1;
   public T2(Syn s1)
     {
       this.s1=s1;
     }
   public void run()
    {
      s1.display("Laxmi hello");
    }
}
class Sync 
{
  public static void main(String args[])
    {
      Syn a = new Syn();
      T1 p=new T1(a);
      T2 q=new T2(a);
      p.start();
      q.start();
    }
} 

