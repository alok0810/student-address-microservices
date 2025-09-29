import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args)
    {
        List<Integer> l1 =List.of(1,2,3);
        List<Integer> l2 =List.of(4,5);
        l1.stream().map(i->i);
        System.out.println(l1.stream().collect(Collectors.toMap(i->i,j->j)));



l1.stream().forEach(i->{
    l2.stream().forEach(j-> System.out.println(i+","+j));
});

        List<List<Integer>> result = l1.stream()
                .flatMap(i -> l2.stream().map(j -> List.of(i, j)))
                .collect(Collectors.toList());
        System.out.println("abc"+result);
    }
}
