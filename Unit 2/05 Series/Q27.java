//Accept n from the user & display all prime numbers up to n.

import java.util.Scanner;

public class Q27
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for (int num = 2; num <= n; num++) {
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

            if(isPrime)
            {
                System.out.println(num);
            }
        }
    }
}