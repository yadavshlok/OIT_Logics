//Print the Fibonacci series up to n terms.

import java.util.Scanner;

public class Q22
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the end : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int cnt = 0;
        while(cnt < n)
        {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            cnt++;
        }
    }
}