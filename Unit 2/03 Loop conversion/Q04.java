//Write a program to reverse a number using a while loop.

import java.util.Scanner;

public class Q04
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int rev = 0;
        while(num > 0)
        {
            int digit = num % 10;
            rev = rev*10 + digit;
            num /= 10;
        }
        System.out.println("Reversed : "+rev);
    }
}