//Prime Number Check

import java.util.Scanner;

public class Q02_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        boolean isPrime = true;
        for(int i = 2;i <= Math.sqrt(num);i++)
        {
            if(num % i == 0)
            {
                isPrime = false;
                break;
            }
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