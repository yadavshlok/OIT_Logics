//Compute the sum : X^1+x^2+x^3+⋯+x^x

import java.util.Scanner;

public class Q32
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = sc.nextInt();

        long sum = 0;
        for(int i = 1;i<=x;i++)
        {
            long val = (int)(Math.pow(x,i));
            sum += val;
        }
        System.out.println("Sum : "+sum);
    }
}