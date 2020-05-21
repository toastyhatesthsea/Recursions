package SelfTest;

public class Funs
{
    public static void cheers(int n)
    {
        if (n <= 1)
        {
            System.out.println("Hurrah");
        } else
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
        } else
        {
            return 1 + digits(num / 10);
        }
    }

    /**
     * Sum of the reciprocals of the first n positive integers
     *
     * @param n Non-negative integer
     * @return
     */
    public static double sumover(int n)
    {
        if (n == 1)
        {
            return 1;
        } else if (n == 0)
        {
            return 0;
        } else if (n < 0)
        {
            throw new IllegalArgumentException("Number must be positive");
        } else
        {
            return (1 / (double) n) + sumover(n - 1);
        }
    }

    public static void reverseArray(char[] anArray, int bound1, int bound2)
    {
        if (bound1 < 0 || bound2 >= anArray.length)
        {
            throw new IllegalArgumentException("Not valid bounds of array");
        }

        if ((bound1 < bound2))
        {
            char firstChar = anArray[bound1];
            anArray[bound1] = anArray[bound2];
            anArray[bound2] = firstChar;

            reverseArray(anArray, bound1 + 1, bound2 - 1);
        }
    }

    public static String moreAsterisks(int numberOfAsterisks, String asterisks)
    {
        if (numberOfAsterisks == 1)
        {
            System.out.println(asterisks);
            System.out.println(asterisks);
            return asterisks;
        }
        else
        {
            //String asterisks = "";
            System.out.println(asterisks);
            String moreAsterisks = asterisks + "*";
            moreAsterisks(numberOfAsterisks - 1, moreAsterisks);
            System.out.println(asterisks);
            return asterisks;
        }
    }

}

class FunsTest
{
    public static void main(String[] asas)
    {
        //Funs.cheers(3);
        //Funs.asterisk(3);

        //int answer = Funs.digits(1231234);

        char[] anArray = {'A', 'B', 'C', 'D'};

        //double answer2 = Funs.sumover(-3);

        //Funs.reverseArray(anArray, 1, 3);

        Funs.moreAsterisks(4, "*");
    }
}
