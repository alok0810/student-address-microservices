import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFibonacci {
    public static void main(String[] args) {

      //  Stream.iterate(new int[]{0,1}, f-> new int[]{f[1],f[0]+f[1]}).limit(10).skip(1).forEach(f->System.out.print(f[0] +","));
        String s="He@111llo World";
        StringBuilder l1 = new StringBuilder();
  /*      Stream.iterate(0,i->i+1).limit(s.length()).forEach(k->{
            if(Character.isLetter(s.charAt(k)))
                l.append(s.charAt(k));
        });*/
        StringBuilder l = new StringBuilder();

        Stream.iterate(0,i->i+1).limit(s.length()).filter(k->Character.isLetter(s.charAt(k))).forEach(k->l.append(s.charAt(k)));
        System.out.println(l);
        String st=s.chars().mapToObj(c->(char)c).filter(Character::isLetter).reduce("",(x,y)->x+y,(a,b)->a);
        String s1="Hello World";
        System.out.println(st);
    }
}
