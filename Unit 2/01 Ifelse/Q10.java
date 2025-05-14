//Check whether the second number is between the first and third.

import java.util.Scanner;

public class Q10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();

        System.out.print("Enter b : ");
        int b = sc.nextInt();

        System.out.print("Enter c : ");
        int c = sc.nextInt();

        if(a < b && b < c)
        {
            System.out.println("b is between a & c");
        }
        else
        {
            System.out.println("b is not between a & c");
        }
    }
}