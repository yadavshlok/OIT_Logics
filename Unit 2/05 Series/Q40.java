//Compute the harmonic series with odd numbers : 1/1 + 1/3 + 1/5 + 1/7 + ……… + 1/n

import java.util.Scanner;

public class Q40
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        double sum = 0;
        for(int i = 1;i <= n;i += 2)
        {
            double add = 1.0/i;
            sum += add;
        }
        System.out.println("Sum : "+sum);

    }
}