import java.util.Arrays;
import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6,110),
                Arrays.asList(7,8,9)
        );
        System.out.println("abc--->"+""+ listOfLists);
       List<Integer>resultList= listOfLists.stream().flatMap(list -> list.stream()).toList();
        System.out.println(resultList);
        System.out.println("***********************************");
        resultList.stream().reduce((a,b)->a>b?a:b).ifPresent(System.out::println);
       int a= resultList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of list using java 8---->"+""+a);
    }
}
