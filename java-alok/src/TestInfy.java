import java.util.*;
public class TestInfy {

    public static  void main(String[] args)
    {
        int[] a={1,1,1,2,2,2,3,3,3,4,4};
        Map<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(map.containsKey(a[i]))
            {
                map.put(a[i],map.get(a[i])+1);
            }
            else {
                map.put(a[i],1);
            }


        }
        System.out.println(map);
    }
}
