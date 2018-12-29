import java.util.Random;

public class TREG {
    public static void main(String[] args) {
        int a;
        a = (1 + new Random().nextInt(10));
        System.out.println(a);
        {
            if (a == 5) ;
            System.out.println("вы угадали");

        }
    }
}


