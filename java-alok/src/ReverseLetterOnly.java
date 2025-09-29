public class ReverseLetterOnly {
    public static void main(String[] args) {
        String s = "@a*b-cd*";
        String res="";


        for(int j=s.length()-1;j>=0;j--){
            if(Character.isLetter(s.charAt(j))) {
                res += s.charAt(j);

            }


        }

        for(int j=0;j<s.length();j++) {
            if (!Character.isLetter(s.charAt(j))) {

                res = res.substring(0, j) + s.charAt(j) + res.substring(j);



            }
            System.out.println("result--->" + "" + res);

        }

        System.out.println(res);
    }


}
