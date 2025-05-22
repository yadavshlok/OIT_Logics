//Write a program to find the sum of digits of a given number

import java.util.Scanner;

public class Q03
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int sum = 0;
        while(num > 0)
        {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println("Sum : "+sum);
    }
}