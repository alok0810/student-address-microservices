public class MinSizeSubarray
{
    public static void main(String[] args)
    {
        int[] a={1,1,1,1,1,1,1,1};
        int target =11;
        int left,right,sum ;
        int min=Integer.MAX_VALUE;
        left = right = sum=0;
     for(right =0;right<a.length;right++)
     {
         sum+=a[right];

         while(sum>=target)
         {
              min=Math.min(right-left+1,min);
              sum=sum-a[left];
              left++;
         }
     }
        System.out.println("aaaaa"+"------->"+min);
      min=  (min != Integer.MAX_VALUE) ? min : 0;
        System.out.println(min);
    }
}
