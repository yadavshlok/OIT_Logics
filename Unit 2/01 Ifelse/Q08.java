//Check whether a number is positive or negative.

import java.util.Scanner;

public class Q08
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if(n > 0)
        {
            System.out.println("Number is positive");
        }
        else if(n < 0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Try again");
        }
    }
}