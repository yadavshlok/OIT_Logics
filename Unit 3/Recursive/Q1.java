//Write a recursive method to find the sum of digits using recursion.

import java.util.Scanner;

public class Q1
{
    public static int add(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }

        return n + add(n-1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        int sum = add(n);
        System.out.println("Sum : "+sum);
    }
}