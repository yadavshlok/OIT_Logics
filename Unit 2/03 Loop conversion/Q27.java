//Convert a given decimal number to binary.

import java.util.Scanner;

public class Q27
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();

        System.out.println("Decimal : "+n);
        String binary = "";
        while(n > 0)
        {
            int dig = n % 2;
            binary = dig + binary;
            n /= 2;
        }
        System.out.println("Binary : "+binary);
    }
}