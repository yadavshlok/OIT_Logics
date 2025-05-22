//Convert a given decimal number to octal.

import java.util.Scanner;

public class Q29
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();

        System.out.println("Decimal : "+n);
        String octal = "";
        while(n > 0)
        {
            int dig = n % 8;
            octal = dig + octal;
            n /= 8;
        }
        System.out.println("Octal : "+octal);
    }
}