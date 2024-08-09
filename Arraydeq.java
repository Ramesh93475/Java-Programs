import java.util.ArrayDeque;

class ArrayDeq
{
    public static void main(String[] args) {
        ArrayDeque<Integer> a =new ArrayDeque<>();
        a.offerLast(9);
        a.offerLast(10);
        a.offerLast(55);
        a.offerFirst(1);
        a.offerFirst(88);
        a.forEach((x)->System.out.println(x));
        a.offerFirst(77);
        a.offerLast(100);
        a.forEach((x)->System.out.println(x));
        a.pollFirst();
        a.pollLast();
        a.forEach((x)->System.out.println(x));

    }
}