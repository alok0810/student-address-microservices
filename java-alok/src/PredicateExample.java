import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class PredicateExample {
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        Predicate<Integer> even =i->i%2==0;
        List<Integer>result= list.stream().filter(even).collect(Collectors.toList());

        System.out.println("Even Numbers --->"+result);
    }
}
