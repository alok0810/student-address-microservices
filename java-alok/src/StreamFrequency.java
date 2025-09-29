import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class StreamFrequency
{

    public static void main(String args[])
    {
        Integer[] arr = new Integer[]{4,1,3,2,4,2,1,4};
       List<Integer> list= Arrays.asList(arr);
        int[] a = new int[]{4,1,3,2,4,2,1,4};
        Arrays.stream(a).mapToObj(Integer::valueOf).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
     Map<Integer,Long> map=  list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
        System.out.println(map);
    }
}
