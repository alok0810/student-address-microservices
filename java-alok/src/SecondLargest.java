import java.util.*;
public class SecondLargest {
    public static void main(String[] args)
    {
        List<Integer> list =Arrays.asList(1,3,5,7,2,9,3);
        System.out.println(list.stream().sorted().skip(1).findFirst().get());
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list.stream().mapToInt(Integer::intValue).skip(1).findFirst().getAsInt());

    }
}
