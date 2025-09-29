import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe
{
    public static void main(String[] args)
    {
        CopyOnWriteArrayList<Integer> list =new CopyOnWriteArrayList<>( Arrays.asList(1,2,3,4,5,6,7,8));
        Iterator<Integer> itr=list.iterator();
        while(itr.hasNext())
        {
            int value=itr.next();
            System.out.println("values--->"+""+value);
            if(value==3)
            {
                list.remove(5);
            }
        }
//CopyOnWriteArrayList

    }
}
