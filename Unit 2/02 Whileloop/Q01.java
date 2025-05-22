//Print numbers from 1 to 1000.

import java.util.Scanner;

public class Q01
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(i <= 1000)
        {
            System.out.print(i+" ");
            i++;
        }
    }
}