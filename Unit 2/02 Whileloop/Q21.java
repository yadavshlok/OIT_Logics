/*Write a program to read a 3-digit number and find whether the middle digit is numerically
equal to the sum of the other Two digits and prints an appropriate response? */

import java.util.Scanner;

public class Q21
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3-digit number : ");
        int n = sc.nextInt();

        int a = n / 100;
        int b = (n / 10) % 10;
        int c = n % 10;

        if(b == a + c)
        {
            System.out.println("Is Equal");
        }
        else
        {
            System.out.println("Is NOT Equal");
        }

    }
}