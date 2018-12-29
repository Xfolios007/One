import java.util.Random;
import java.util.Scanner;

public class BSD
{
    public static void main(String [] args )
    {
        Scanner sc = new Scanner(System.in);

        char ch = (char) ('A' + new Random().nextInt (26));
        System.out.println(ch);

        for (char i = 0; i < 26; i++)
        {
            char s = sc.next(). charAt(0);
            if (ch == s) {
                System.out.println("Congrations");
                break;
            }
            else
            {
                System.out.println("Sorry try again");
            }
        }

    }
}
