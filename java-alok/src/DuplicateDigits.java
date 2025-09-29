import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateDigits {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(3);
        list.add(5);

        Set<Integer> seen = new java.util.HashSet<>();
        List<Integer> duplicates = list.stream()
                .filter(n -> !seen.add(n)) // Add to the set and check if it was already present
                .distinct() // Ensure duplicates are not repeated in the output
                .collect(Collectors.toList());

        System.out.println("Duplicate elements: " + duplicates);
        System.out.println( list.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting())));

        List<Integer> duplicate = list.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting())) // Group by value and count occurrences
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1) // Filter entries with count > 1
                .map(Map.Entry::getKey) // Extract the keys (duplicate elements)
                .collect(Collectors.toList());

        System.out.println("Duplicate elements: " + duplicate);
    }
}
