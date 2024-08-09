abstract class Figure
{
void quadrilateral()
{
System.out.println("given figure");
}
abstract void area();
}
class Tri extends Figure
{
int a=10,b=5;

public void area()
{
  System.out.println("Triangle");
  System.out.println("The area is "+(0.5)*a*b);
}
}
class Sq extends Figure
{
int a=10;

public void area()
{
System.out.println("Square");
  System.out.println("The area is "+a*a);
}
}
class Area
{
public static void main(String args[])
{
Tri t=new Tri();
Sq s= new Sq();
t.quadrilateral();
t.area();
s.quadrilateral();
s.area();
}
}