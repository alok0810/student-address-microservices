import java.util.*;
import java.util.stream.Collectors;

public class SortHashMap {
    public static void main(String[] args) {
        Map<String, Integer> map=new HashMap<>();

        map.put("G",20);
        map.put("C",30);
        map.put("A",10);
        map.put("B",40);
        map.put("E",50);
        map.entrySet().stream().forEach(System.out::println);

        System.out.println("*********************************");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(
                Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new
        ));
        for(Map.Entry<String,Integer> entry: map.entrySet())
        {
            System.out.println(entry.getKey()+"--------------> "+entry.getValue());
        }


       TreeMap<String, Integer> map2 = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, TreeMap::new));
       map2.entrySet().stream().forEach(System.out::print);
    }
}
