//Check whether a given number is a Magic Number.

import java.util.Scanner;

public class Q15
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int n = num;
        int sum = 0;
        int sum2 = 0;
        while(num > 0)
        {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        while(sum > 0)
        {
            int digit2 = num % 10;
            sum2 += digit2;
            sum /= 10;
        }
        
        if(sum2 == 1)
        {
            System.out.println(n +" is a Magic Number");
        }
        else
        {
            System.out.println(n +" is NOT a Magic Number");
        }
    }
}