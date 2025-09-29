import java.util.*;
import java.util.stream.Collectors;

public class Practice1 {
    public static void main(String[] args) {
        List<Integer>  list1= Arrays.asList(1,2,3,4,5,6);
      OptionalDouble avg=  list1.stream().mapToDouble(i -> i).average();
      int sum=  list1.stream().mapToInt(i->i).sum();
        System.out.println("Sum: " + sum);
         Optional<Integer> a= list1.stream().filter(i->i%3==0).findAny();
        System.out.println("Factor of 3 is"+" "+a.get());
        Map<Integer,String> map =new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(-3,"minusthree");
        map.put(3,"three");
        map.put(4,"four");
      Map<Integer,String> mpa= map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
        System.out.println(mpa);
        map.entrySet().stream().forEach(entry->
        {
            System.out.println(entry.getKey() + " iterate " + entry.getValue());
        });

    }
}
