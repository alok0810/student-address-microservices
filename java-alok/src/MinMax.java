import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, -6, 7, 8, 9, -1);
        int min = list.stream().mapToInt(Integer::intValue).min().orElse(0);
        int max = list.stream().mapToInt(Integer::intValue).max().orElse(100);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

    }
}
