public class RecordsExample {

    public static void main(String []args)
    {
        test t1=new test(5,10,"alok");
        System.out.println(t1.a());
    }
}
record test(int a,int b,String name)
{
}
