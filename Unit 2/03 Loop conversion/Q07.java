//Write a program to find the sum of the first and last digit of a number.

import java.util.Scanner;

public class Q07
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int ld = num % 10;
        int fd = num;
        while(fd >= 10) 
        {
            fd /= 10;
        }
        int sum = fd + ld;
        System.out.println("Sum : " + sum);
    }
}