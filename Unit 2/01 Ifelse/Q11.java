//Check whether the third number is between the first and second.

import java.util.Scanner;

public class Q11
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

        if(a < c && c < b)
        {
            System.out.println("c is between a & b");
        }
        else
        {
            System.out.println("c is not between a & b");
        }
    }
}