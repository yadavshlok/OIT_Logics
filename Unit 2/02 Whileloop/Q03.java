//Print numbers from 100 to 5000, incrementing by 50.

import java.util.Scanner;

public class Q03
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = 100;
        while(n <= 5000)
        {
            System.out.print(n+" ");
            n += 50;
        }
    }
}