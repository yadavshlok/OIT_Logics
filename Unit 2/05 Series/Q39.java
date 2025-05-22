//Compute the sum : 1.0 + 1.1 + 1.2 + 1.3 + ………+n

import java.util.Scanner;

public class Q39
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        double sum = 0;
        for(int i = 1;i <= n;i++)
        {
            double num = 1.0 + i * 0.1;
            sum += num;
        }
        System.out.println("Sum : "+sum);
    }
}