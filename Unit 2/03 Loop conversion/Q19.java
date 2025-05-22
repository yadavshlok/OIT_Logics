//Print all Palindrome numbers up to N.

import java.util.Scanner;

public class Q19
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        for(int i = 1;i <= num;i++)
        {
            int n = i;
            int rev = 0;
            while(n > 0)
            {
                int digit = n % 10;
                rev = rev*10 + digit;
                n /= 10;
            }
            if(i == rev)
            {
                System.out.println("Palindrome num : "+i);
            }
        }
    }
}