import java.util.Optional;

import static java.util.Optional.of;

public class SingletonExample {
    public static void main(String[] args) {
        SingletonTest s1 = SingletonTest.getInstance();
        SingletonTest s2 = SingletonTest.getInstance();
        System.out.println(s1==s2);
        Optional<String> a= Optional.of("Hello");


    }
}
class SingletonTest{
    private static  SingletonTest instance =null;
    private SingletonTest() {
    }

        static SingletonTest getInstance(){
        if(instance==null){
            instance = new SingletonTest();
        }
        return instance;
    }

    }

