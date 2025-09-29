import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class SubarrayK {

    public static void main(String [] args)
    {
       int nums[] = {1, 2, 3, 4, 5, 6, 7, 8} ;
       int k=15;
       int[] p=new int[nums.length];
       p[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            p[i]=p[i-1]+nums[i];

        }
        IntStream.range(0, nums.length).forEach(i -> {
            System.out.print(p[i]+" ");
        });
        System.out.println("**************************");

        Map<Integer,Integer> map=new HashMap<>();
        int l=0;
        for(int j=0;j<nums.length;j++)
        {
            if(p[j]==k)
            {
                l++;
            }
            int val =p[j]-k;

            if(map.containsKey(val))
            {
                l=l+map.get(val);
            }
            if(!map.containsKey(p[j]))
            {
                System.out.println("oooooooo "+p[j]);
                map.put(p[j],0);
            }

            map.put(p[j],map.get(p[j])+1);

        }
        map.entrySet().stream().forEach(i->
        {
            System.out.println(i.getKey()+"  ----  "+i.getValue());
        });
        System.out.println(l);
    }
}
