//Write a method to check if a number is a palindrome.

import java.util.Scanner;

public class Q4
{
    public static int palindrome(int num)
    {
        int n = num;
        int rev = 0;
        while(num > 0)
        {
            int digit = num % 10;
            rev = rev*10 + digit;
            num /= 10;
        }
        return rev;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int rev = palindrome(num);
        if(num == rev)
        {
            System.out.println(num+" is a Palindrome");
        }
        else
        {
            System.out.println(num+" is NOT a Palindrome");
        }
    }
}