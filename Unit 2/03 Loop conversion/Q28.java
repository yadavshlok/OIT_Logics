//Convert a given binary number to decimal.

import java.util.Scanner;

public class Q28
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number : ");
        int n = sc.nextInt();

        System.out.println("Binary : "+n);
        int dec = 0;
        int pow = 0;

        while(n > 0)
        {
            int dig = n % 10;
            dec += (dig * Math.pow(2,pow));
            pow++;
            n /= 10;
        }
        System.out.println("Decimal : "+dec);
    }
}