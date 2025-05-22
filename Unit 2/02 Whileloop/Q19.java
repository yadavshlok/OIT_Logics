//Accept a number and check if it is prime.

import java.util.Scanner;

public class Q19
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

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

        if(isPrime == true)
        {
            System.out.println(num + " is Prime");
        }
        else
        {
            System.out.println(num + " is not prime");
        }
    }
}