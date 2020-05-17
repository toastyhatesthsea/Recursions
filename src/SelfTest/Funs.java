package SelfTest;

public class Funs
{
    public static void cheers(int n)
    {
        if (n <= 1)
        {
            System.out.println("Hurrah");
        }
        else
        {
            System.out.println("Hip");
            cheers(n - 1);
            System.out.println("Hip");
        }
    }

    public static void asterisk(int n)
    {
        if (n >= 1)
        {
            System.out.println("*");
            asterisk(n - 1);
            System.out.println("!");
        }
    }

    public static int digits(int num)
    {
        if (num <= 9)
        {
            return 1;
        }
        else
        {
            return 1 + digits(num / 10);
        }
    }

}

class FunsTest
{
    public static void main(String[] asas)
    {
        //Funs.cheers(3);
        //Funs.asterisk(3);

        int answer = Funs.digits(1231234);
    }
}
