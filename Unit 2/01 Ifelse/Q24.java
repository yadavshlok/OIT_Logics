//Find the maximum of three numbers using nested if-else.

import java.util.Scanner;

public class Q24
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

        if(a > b)
        {
            if(a > c)
            {
                System.out.println("The maximum number is : " +a);
            }
            else
            {
                System.out.println("The maximum number is : " +c);
            }
        }
        else
        {
            if(b > c)
            {
                System.out.println("The maximum number is : " +b);
            }
            else
            {
                System.out.println("The maximum number is : " +c);
            }
        }
    }
}