//Factorial Calculation

import java.util.Scanner;

public class Q02_4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        int fact = 1;
        for (int i = n; i >= 1; i--)
        {
            fact *= i;
        }

        System.out.println("Factorial is : "+fact);
    }
}