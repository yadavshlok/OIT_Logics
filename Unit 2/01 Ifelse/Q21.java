//Check whether a number is 1-digit, 2-digit, 3-digit, 4-digit, or above.

import java.util.Scanner;

public class Q21
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        if(num <= 9)
        {
            System.out.println("Number is 1-digit");
        }
        else if(num > 9 && num <=99)
        {
            System.out.println("Number is 2-digit");
        }
        else if(num > 99 && num <= 999)
        {
            System.out.println("Number is 3-digit");
        }
        else if(num > 999 && num <= 9999)
        {
            System.out.println("Number is 4-digit");
        }
        else
        {
            System.out.println("Above");
        }
    }
}