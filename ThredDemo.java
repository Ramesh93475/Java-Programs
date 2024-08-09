public class ThredDemo extends Thread
{
//int i=1;
public void run()
//void Hi()
{
while(true){
System.out.println("Hello");
i++;
}
}
public static void main(String args[])
{
ThredDemo d=new ThredDemo();
//d.Hi();
d.start();
for(;;){
System.out.println("World");}
}
}