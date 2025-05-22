//Print all Strong numbers up to N.

import java.util.Scanner;

public class Q20
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        for(int i = 1;i <= num;i++)
        {
            int n = i;
            int sum = 0;
            while(n > 0)
            {
                int fact = 1;
                int digit = n %10;
                while(digit >= 1)
                {
                    fact *= digit;
                    digit--;
                } 
                n /= 10;
                sum += fact;
            }

            if(sum == i)
            {
                System.out.println("Strong Numbers : "+i);
            }
        }
    }
}