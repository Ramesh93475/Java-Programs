import java.util.*;
public class Listdemo {
 public static void main(String args[]) {
     LinkedList<int> a=new LinkedList<int>();
     LinkedList<int> b=new LinkedList<int>(List.of(9,7,10,66));
     a.add(10);
     a.add(20);
     a.add(30);
     a.addAll(2,b);
     for(ListIterator<integer> i=a.listIterator();i.hasNext();)
     {
         System.out.println(i.hasNext());
     }
 }
}
