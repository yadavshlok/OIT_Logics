//Compute the sine series : 1 - x^3/3! + x^5/5! – x^7/7! + ... + x^n/n!

import java.util.Scanner;

public class Q43
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the val of x : ");
        int x = sc.nextInt();
        System.out.print("Enter the val of n : ");
        int n = sc.nextInt();
        
        double sum = 0;
        int sign = 1;
        for(int i = 1; i <= n; i += 2)
        {
            int fact = 1;
            for(int j = 1; j <= i; j++)
            {
                fact *= j;
            }
            sum += sign * Math.pow(x, i) / fact;
            sign *= -1;
        }
        System.out.println("Sum : " + sum);
    }
}