//Write a method to check if a number is prime

import java.util.Scanner;

public class Q1
{
    public static boolean prime(int num)
    {
        boolean isPrime = true;
        int i = 2;
        while(i <= Math.sqrt(num))
        {
            if(num % i == 0)
            {
                isPrime = false;
                break;
            }
            i++;
        }

        return isPrime;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        boolean isPrime = prime(num);
        if(isPrime)
        {
            System.out.println(num + " is Prime");
        }
        else
        {
            System.out.println(num + " is not prime");
        }
    }
}