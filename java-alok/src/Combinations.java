import java.util.HashSet;
import java.util.Set;

public class Combinations{
    static Set<String> set=new HashSet<>();
    public static void printDistinctPermutations(String str, int left, int right) {
        if (left == right) {
            set.add(str);
           // System.out.print(str + " ");
        } else {
            for (int j= left; j <= right; j++) {
                str = swap(str, left, j);
                printDistinctPermutations(str, left + 1, right);
                str = swap(str, left, j);
            }
        }
    }
    public static String swap(String str, int x, int y) {
        char[] charArray = str.toCharArray();
        char temp = charArray[x];
        charArray[x] = charArray[y];
        charArray[y] = temp;
        return new String(charArray);
    }
    public static void main(String[] args) {
        String input = "abc";
        printDistinctPermutations(input, 0, input.length() - 1);
        System.out.println(set.size());
        set.stream().forEach(System.out::println);
    }
}