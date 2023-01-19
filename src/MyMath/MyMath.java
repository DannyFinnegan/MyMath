package MyMath;

import javax.swing.*;

public class MyMath
{
    public static int customPower(int number, int power)
    {
        int answer=1;
        for (int i=0;i<power;i++)
        {
            answer=answer * number;
        }
        return answer;
    }

    public static int sumOf(int n)
    {
        int sum=0;
        for (int i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        return sum;
    }
    public static int factorial(int j)
    {
        int sum=1;
        for (int i=1;i<=j;i++)
        {
            sum=sum*i;
        }
        return sum;
    }
    public static boolean prime(int q)
    {
        boolean prime=true;
        for (int i=2;i<q;i++)
        {
            if (q%i==0)
            {
                prime=false;
            }
        }
        return prime;
    }


}
