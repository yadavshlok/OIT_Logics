//Check whether a given number is a Palindrome.

import java.util.Scanner;

public class Q06
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int n = num;
        int rev = 0;
        while(num > 0)
        {
            int digit = num % 10;
            rev = rev*10 + digit;
            num /= 10;
        }
        if(n == rev)
        {
            System.out.println("It is a Palindrome");
        }
        else
        {
            System.out.println("It is NOT a Palindrome");
        }
    }
}