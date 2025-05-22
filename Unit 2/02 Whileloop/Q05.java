//Print numbers from 1000 to 100, decrementing by 80.

import java.util.Scanner;

public class Q05
{
    public static void main(String[] args)
    {
        int i = 1000;
        while(i>=100)
        {
            System.out.print(i+" ");
            i -= 80;
        }
    }
}