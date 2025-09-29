public class CustomException {

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            if (b == 0) {
                throw new invalidBA("Invalid b value"+"b value"+""+b,b);
            }

            int c = a / b;
            System.out.println(c);
        } catch (invalidBA e) {
            System.out.println(e.getMessage());
        }
    }
}

class invalidBA extends Exception
{
    int b;
    public invalidBA(String s,int b)
    {
        super(s);
        this.b=b;

    }
}
