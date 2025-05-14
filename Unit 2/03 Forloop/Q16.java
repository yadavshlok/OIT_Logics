//Check whether two numbers are Twin Primes.

import java.util.Scanner;

public class Q16
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        boolean isPrime1 = true;
        int i = 2;
        while(i <= Math.sqrt(num1))
        {
            if(num1 % i == 0)
            {
                isPrime1 = false;
                break;
            }
            i++;
        }

        boolean isPrime2 = true;
        i = 2;
        while(i <= Math.sqrt(num2))
        {
            if(num2 % i == 0)
            {
                isPrime2 = false;
                break;
            }
            i++;
        }
        
        if(isPrime1 == true && isPrime2 == true)
        {
            if(num1 - num2 == 2 || num1 - num2 == -2)
            {
                System.out.println(num1 +" & "+num2+" are Twin prime");
            }
            else
            {
                System.out.println(num1 +" & "+num2+" are NOT Twin prime");
            }
        }
        else
        {
            System.out.println("Please enter prime numbers");
        }
    }
}