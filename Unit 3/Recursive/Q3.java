//Modify the factorial function to return double factorial.

import java.util.Scanner;

public class Q3
{
    public static int doublefact(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }

        System.out.println(n);
        return n * doublefact(n-2);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        int fact = doublefact(n);
        System.out.println("Double Factorial : "+fact);
    }
}