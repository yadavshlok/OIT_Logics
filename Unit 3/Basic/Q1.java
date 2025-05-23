//Write a method to perform addition of two numbers.

import java.util.Scanner;

public class Q1
{
    public static int add(int a,int b)
    {
        int c = a+b;
        return c;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();

        System.out.print("Enter b : ");
        int b = sc.nextInt();
        
        int c = add(a,b);
        System.out.println(a+" + "+b+" = "+c);
    }
}