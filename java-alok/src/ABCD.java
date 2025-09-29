public class ABCD {

    public static void main(String[] args)
    {
        int a[] ={2,7,13,17,19};
        int b[] ={1,6,14,18,20};

        int c[] =new int[10];

       int l=0,j=0,i=0;
            while(l<a.length && j<b.length)
            {
                if(a[l]<b[j])
                {
                    c[i]=a[l];
                    l++;

                }
                else {
                    c[i]=b[j];
                    j++;
                }
                i++;
        }

           while(l<a.length)
           {
               c[i]=a[l];
               l++;
               i++;
           }

           while(j<b.length)
           {
               c[i]=b[j];
               j++;
               i++;
           }


            for(int k:c)
            {
                System.out.println(k);
            }



    }
}
