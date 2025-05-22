//Print all Prime Palindrome numbers up to N.

import java.util.Scanner;

public class Q23
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        for(int i = 2; i <= num; i++)
        {
            int n = i;
            boolean isPrime = true;
            int j = 2;
            while(j <= Math.sqrt(n))
            {
                if(n % j == 0)
                {
                    isPrime = false;
                    break;
                }
                j++;
            }

            int temp = n;
            int rev = 0;
            while(temp > 0)
            {
                int dig = temp % 10;
                rev = rev *10 + dig;
                temp /= 10;
            }

            if(isPrime == true && rev == n)
            {
                System.out.println("Prime Palindrome : "+n);
            }
        }
    }
}