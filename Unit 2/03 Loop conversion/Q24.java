//Print all Twin Primes up to N.

import java.util.Scanner;

public class Q24
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        for(int n = 2; n <= num - 2; n++) 
        {
            boolean isPrime1 = true;
            for(int i = 2; i <= Math.sqrt(n); i++) 
            {
                if(n % i == 0) 
                {
                    isPrime1 = false;
                    break;
                }
            }
            boolean isPrime2 = true;
            int n2 = n + 2;
            for(int i = 2; i <= Math.sqrt(n2); i++) 
            {
                if(n2 % i == 0) 
                {
                    isPrime2 = false;
                    break;
                }
            }

            if(isPrime1 && isPrime2) 
            {
                System.out.println("Twin Primes : "+n + " & " + n2);
            }
        }
    }
}