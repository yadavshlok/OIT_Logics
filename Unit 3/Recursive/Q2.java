//Write a recursive method to find factorial of a number.

import java.util.Scanner;

public class Q2
{
    public static int fact(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }

        return n * fact(n-1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        int fact = fact(n);
        System.out.println("Factorial : "+fact);
    }
}