//Convert a given octal number to decimal

import java.util.Scanner;

public class Q30
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();

        System.out.println("Octal : "+n);
        int dec = 0;
        int pow = 1;
        int temp = n;
        while(temp > 0)
        {
            int dig = temp % 10;
            dec += dig * pow;
            pow *= 8;
            temp /= 10;
        }
        System.out.println("Decimal : " + dec);
    }
}