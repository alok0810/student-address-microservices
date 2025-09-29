public class LongestCommonPrefix {

        public static String longestCommonPrefix(String[] strs) {
            String a = strs[0];
            int n=a.length();
            String res="";
            int k=0;
            int count =1;
            boolean flag =true;
            if(strs.length==1)
                return a;
            while(k<n)
            {
                if(n>0)
                {
                    for(int i=1;i<strs.length;i++)
                    {
                        if(k<strs[i].length())
                        {
                            if(a.charAt(k)!=strs[i].charAt(k))
                            {
                                flag =false;
                                break;
                            }
                            System.out.println("k----"+""+strs[i].charAt(k));

                            count++;
                            if(count ==strs.length)
                            {
                                res=res+a.charAt(k);
                            }
                        }
                    }
                    count =1;
                }
                if(!flag)
                {
                    break;
                }
                k++;
            }

            return res;
        }

        public static void main(String[] args)
        {
            String nums[]={"car","cir"};
            System.out.println(longestCommonPrefix(nums));
        }
    }

