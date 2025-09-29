import java.util.*;
public class AlepoTest {


    public static void main(String[] args) throws MyException {

        //null pointer exception
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,-5);
        try {
            list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
        } catch (Exception e) {
            throw new MyException();

    }
       int a= list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("a===>   "+a);
    }


 static class MyException extends Exception {
     public MyException() {
         super("Null value in the list");
     }
 }}
