//Check whether the first number is between the second and third.

import java.util.Scanner;

public class Q09
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

        if(b < a && a < c)
        {
            System.out.println("a is between b & c");
        }
        else
        {
            System.out.println("a is not between b & c");
        }
    }
}