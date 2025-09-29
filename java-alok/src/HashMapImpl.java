import java.util.HashMap;

public class HashMapImpl
{
    public static void main(String []args)
    {
    Student s1 =new Student("Apple", 1, "F");
    Student s2 =new Student("Apple", 2, "F");
    Student s3= new Student("Apple", 3, "F");
    Student s4=new Student("Apple", 1, "F");


    HashMap<Student,String> map=new HashMap<>();
    map.put(s1,"A");
    map.put(s2,"B");
    map.put(s3,"C");
    map.put(s4,"D");
    System.out.println(map.get(s1));
    System.out.println(s1.equals(s4));

    }
}
