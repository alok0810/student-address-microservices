import java.sql.SQLOutput;
import java.util.*;

public class FreqHashMap {

    public static void main(String[] args)
    {
        String s="aaababbccccb";
        Map<Character,Integer> map =new HashMap<>();
        for(int i=0;i<s.length();i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
            else {
                map.put(s.charAt(i),1);
            }
        }
        System.out.println("Printing the Output");
        map.entrySet().stream().forEach(i-> System.out.println(i));
        System.out.println("Printing the Output 2");
        int a =map.get(s.charAt(0));
       boolean result= map.values().stream().allMatch(i->i.equals(a));
        System.out.println("result--------->"+""+result);
  char[] k=new char[3];
    }
}
