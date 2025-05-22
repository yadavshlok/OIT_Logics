//Count the total number of digits in a given number.

import java.util.Scanner;

public class Q11
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
            cnt++;
            num /= 10;
        }
        System.out.println("Number of digits : "+cnt);
    }
}