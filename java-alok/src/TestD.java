import java.util.*;
public class TestD {

    public static void main(String[] args) {

        int j,k;
        int nums[]={-1,0,1,2,-1,-4};
        List<List<Integer>> list =new ArrayList<>();
        Arrays.sort(nums);
          int sum =0;
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length-2;i++)
        {
            j=i+1;
            k=nums.length-1;
            while(j<k)
            {
                sum =nums[i]+nums[j]+nums[k];
                if(sum<0)
                {
                    j++;
                }
                if(sum>0)
                {
                    k--;
                }
                if(sum==0)
                {
                    list.add(Arrays.asList(nums[i],nums[j],nums[k]));

                    j++;
                    k--;
                }
            }

        }
        System.out.println(list);

    }
}
