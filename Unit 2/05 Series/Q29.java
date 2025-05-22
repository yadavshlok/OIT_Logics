//Compute the sum : 1!/x^1+2!/x^2+3!/x^3+…+n!/x^n

import java.util.Scanner;

public class Q29
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.print("Enter x : ");
        int x = sc.nextInt();
        double sum = 0;

        for(int i = 1; i<= n;i++)
        {
            int fact = 1;
            int m = i;
            while(m >= 1)
            {
                fact *= m;
                m--;
            }

            double val = fact / Math.pow(x,i);
            System.out.println(i + ": "+val);
            sum+= val;            
        }

        System.out.println(String.format("Sum : %.4f",sum));
    }
}