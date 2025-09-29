import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class SeprateEvenOdd {

    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    Map<Boolean,List<Integer>> map= list.stream().collect(Collectors.partitioningBy(i->i%2==0));
     map.entrySet().stream().forEach(i->
     {
         System.out.println( i.getValue());
     });
    }
}
