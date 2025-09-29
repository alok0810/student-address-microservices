import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Average {
    public static void main(String[] args) {
        {
            List<Integer> list = new ArrayList();
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(6);

            OptionalDouble a = list.stream().filter(i -> (i % 2 == 0)).mapToDouble(i -> i*i).average();
            int sum=   list.stream().mapToInt(i->i).sum();
            System.out.println("sum using stream====>"+""+sum);
            System.out.println(a.getAsDouble());
        }
    }
}
