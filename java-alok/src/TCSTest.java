import java.util.HashSet;

public class TCSTest {
    public static void main(String[] args)
    {
        String s ="abbbccab1dcd";
        int left =0;
        int right =0;
        int n =s.length();
        System.out.println(s.length());
        int counter =Integer.MIN_VALUE;
        String longest="";

        HashSet<Character>set =new HashSet<>();
        while(right<n)
        {
            if(!set.contains(s.charAt(right)))
            {
                set.add(s.charAt(right));
                if((right-left)>counter)
                {
                    counter =right-left+1;
                    longest =s.substring(left,right+1);

                }
                right++;

            }
            else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        int result =right-left;
        System.out.println("left"+left+"----- "+right);
        String k=s.substring(left,right);
        System.out.println(k);
        System.out.println(result);
        System.out.println("counter"+""+counter);
        System.out.println("longest---->"+""+longest);


    }
}
