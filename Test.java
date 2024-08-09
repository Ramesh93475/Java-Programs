class Test 
{
public static void main(String[] args)
{
double s=0;
for(String i:args)
{
      s=s+Double.parseDouble(i);
}
System.out.println("Sum is"+s);
}
}