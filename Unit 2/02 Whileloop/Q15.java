//Calculate the factorial of a given number n.

import java.util.Scanner;

public class Q15
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        int fact = 1;
        while(n >= 1)
        {
            fact *= n;
            n--;
        }

        System.out.println("Factorial is : "+fact);
    }
}