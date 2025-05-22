//Compute the sum : 1^1+2^2+3^3+⋯+n^n

import java.util.Scanner;

public class Q33
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        long sum = 0;
        for(int i = 1;i<=n;i++)
        {
            long val = (int)(Math.pow(i,i));
            sum += val;
        }
        System.out.println("Sum : "+sum);
    }
}