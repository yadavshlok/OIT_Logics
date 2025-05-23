//Create a method to find the minimum of two numbers.

import java.util.Scanner;

public class Q5
{
    public static int min(int a,int b)
    {
        if(a < b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();

        System.out.print("Enter b : ");
        int b = sc.nextInt();
        
        int ans = min(a,b);
        System.out.println(ans + " is Minimum");
    }
}