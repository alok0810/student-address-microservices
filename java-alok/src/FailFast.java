import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FailFast
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        Iterator<Integer> itr=list.iterator();
        while(itr.hasNext())
        {
            int value=itr.next();
            System.out.println("values--->"+""+value);
            if(value==3)
            {
                list.add(9);
            }
        }
//CopyOnWriteArrayList

    }
}
