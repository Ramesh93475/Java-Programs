class Demon1 extends Thread{
int i=1;
public void run(){
while(i<10){
System.out.println("hiii "+i);
i++;}
}
}
class Demon{
public static void main(String args[]) throws Exception{
Demon1 d = new Demon1();
//d.setDaemon(true);
d.start();
//Thread a=Thread.currentThread();
//a.join();
try{
//d.sleep();
}
catch(Exception e){
System.out.println(e);
}
int i=1;
while(i<10){
System.out.println("hello "+i);
Thread.yield();
i++;}
}
}
