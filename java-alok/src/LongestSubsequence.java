import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;


public class LongestSubsequence {

    public static void main(String[] args) {
                String s = "abbbccab1dcd";
                int left = 0, right = 0;
                String longest = "";
                HashSet<Character> set = new HashSet<>();

                while (right < s.length()) {
                    char c = s.charAt(right);
                    if (!set.contains(c)) {
                        set.add(c);
                        if ((right - left + 1) > longest.length()) {
                            longest = s.substring(left, right + 1);
                        }
                        right++;
                    } else {
                        set.remove(s.charAt(left));
                        left++;
                    }
                }

                System.out.println("Longest substring without repeating characters: " + longest);
            }
        }


       /* String s = "abbbccab1dcd";


        List<String> list = new ArrayList<>();
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            res = res + c;
            for (int j = i + 1; j < s.length(); j++) {
                char d = s.charAt(j);
                if (c != d) {
                    res = res + d;
                } else {
                    list.add(res);
                    res = "";
                    break;

                }
            }
        }

                String result = "";
                for (String p : list) {
                    if (p.length() > result.length()) {
                        result = p;
                    }

                }
        System.out.println(result);
            }*/


