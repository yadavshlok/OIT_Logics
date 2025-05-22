//Check whether a given number is a Strong (Krishnamurthy) Number.

import java.util.Scanner;

public class Q13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int n = num;
        int sum = 0;
        while(num > 0)
        {
            int fact = 1;
            int digit = num %10;
            while(digit >= 1)
            {
                fact *= digit;
                digit--;
            } 
            num /= 10;
            sum += fact;
        }
        
        if(sum == n)
        {
            System.out.println("Is Strong Number");
        }
        else
        {
            System.out.println("Is NOT Strong Number");
        }
    }
}