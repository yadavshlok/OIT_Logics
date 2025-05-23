//Write recursive method to print Fibonacci Series 

import java.util.Scanner;

public class Q5
{
    public static void Fibo(int a, int b, int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.print(a + " ");
        Fibo(b, a + b, n - 1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        Fibo(0, 1, n);
    }
}