class A{
static int a=10;
int b=20;
static void hi()
{
  System.out.println("hi");
}
void hii(){
System.out.println("Hi hello");
}
 static void add(){
System.out.println(a+b);
}
void sub(){
System.out.println(a-b);
}
}
class StaticBlc{
public static void main(String args[]){
A r=new A();
r.add();
r.sub();
A.hi();
}
}