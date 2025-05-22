//Count the number of prime digits in a given number.

import java.util.Scanner;

public class Q12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int cnt = 0;
        while(num > 0)
        {
            int digit = num % 10;
            if(digit == 2 || digit == 3 || digit == 5 || digit == 7)
            {
                cnt++;
            }
            num /= 10;
        }
        System.out.println("Number of prime digits : " + cnt);
    }
}