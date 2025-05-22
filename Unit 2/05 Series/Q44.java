//Compute the sum : 1 - x^2/(2^2*1!) + x^4/(2^4*2!) – x^6/(2^6*3!)

import java.util.Scanner;

public class Q44
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the val of x : ");
        int x = sc.nextInt();
        System.out.print("Enter the val of n : ");
        int n = sc.nextInt();
        
        double sum = 1;
        int sign = -1;
        int fact;
        for(int i = 2, k = 1; i <= n; i += 2, k++)
        {
            fact = 1;
            for(int j = 1; j <= k; j++)
            {
                fact *= j;
            }
            double term = sign * Math.pow(x, i) / (Math.pow(2, i) * fact);
            sum += term;
            sign *= -1;
        }
        System.out.println("Sum : " + sum);
    }
}