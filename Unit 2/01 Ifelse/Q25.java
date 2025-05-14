//Find the minimum of three numbers.

import java.util.Scanner;

public class Q25
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

        if(a > b && a > c)
        {
            System.out.println("The maximum number is : " +a);
        }
        else if(b > a && b > c)
        {
            System.out.println("The maximum number is : " +b);
        }
        else
        {
            System.out.println("The maximum number is : " +c);
        }
    }
}