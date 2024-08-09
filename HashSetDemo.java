import java.util.*;
class HashSetDemo {
public static void main(String args[])
	{
       TreeSet <String>hs = new TreeSet<String>();
      hs.add("Sachin");
    hs.add("Rahul");
     hs.add("Raina");
    hs.add("Dhoni");
    hs.add("Kapil");  
     hs.add("Azhar");
    hs.add("Sachin");
    hs.add("Azhar");
System.out.println(hs);
}}
//public class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable  