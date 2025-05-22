//Count the number of odd, even, and zero digits in a given number.

import java.util.Scanner;

public class Q08
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int ecnt = 0;
        int ocnt = 0;
        int zcnt = 0;

        while(num > 0)
        {
            int digit = num % 10;
            if(digit == 0)
            {
                zcnt++;
            }
            else if(digit % 2 == 0)
            {
                ecnt++;
            }
            else
            {
                ocnt++;
            }
            num /= 10;
        }
        System.out.println("No. of Even digits is : "+ecnt);
        System.out.println("No. of Odd digits is : "+ocnt);
        System.out.println("No. of Zero digits is : "+zcnt);

    }
}