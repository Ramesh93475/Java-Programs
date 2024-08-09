class Test<T>
{
    T obj;
    Test(T obj)
    {
        this.obj = obj;
    }
    public T getObject()
    {
        return this.obj;
    }
}

class Generi1 {
    public static void main(String[] args)
    {
        Test<Integer> iObj = new Test<>(15);
        System.out.println(iObj.getObject());
        Test<String> sObj = new Test<>("Ramesh");
        System.out.println(sObj.getObject());
    }
}

