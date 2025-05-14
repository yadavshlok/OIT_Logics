//Check whether a given number is a Prime Palindrome.

import java.util.Scanner;

public class Q17
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        
        int n = num;

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

        num = n;
        int rev = 0;
        while(num > 0)
        {
            int dig = num % 10;
            rev = rev *10 + dig;
            num /= 10;
        }

        if(isPrime == true && rev == n)
        {
            System.out.println(n +" is Prime Palindrome");
        }
        else
        {
            System.out.println(n +" is NOT Prime Palindrome");
        }
    }
}