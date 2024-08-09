class Exep
{
public static void main(String args[]){
try{
//int a=10/0;
//int[] b=new int[3];
int c=1/0;
//System.out.println(a);
//System.out.println(b[4]);
System.out.println(c);
}
catch(Exception e)
{
System.out.println(e);
}
/*catch(ArithmeticException e)
{
System.out.println("How");
System.out.println(e);
}*/
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);

}
System.out.println("Ramesh");
}
}