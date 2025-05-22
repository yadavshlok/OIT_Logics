//Accept a number from the user and display its digits in ascending order.

import java.util.Scanner;

public class Q26
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        System.out.print("Digits in ascending order: ");
        for(int d = 0; d <= 9; d++) 
        {
            int n = num;
            while(n > 0) 
            {
                int digit = n % 10;
                if(digit == d) 
                {
                    System.out.print(d + " ");
                }
                n /= 10;
            }
        }
        System.out.println();
    }
}