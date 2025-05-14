//Find the maximum of four numbers.

import java.util.Scanner;

public class Q26
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

        System.out.print("Enter d : ");
        int d = sc.nextInt();

        if(a > b && a > c && a > d)
        {
            System.out.println("The maximum number is : " +a);
        }
        else if(b > a && b > c && b > d)
        {
            System.out.println("The maximum number is : " +b);
        }
        else if(c > a && c > b && c > d)
        {
            System.out.println("The maximum number is : " +c);
        }
        else
        {
            System.out.println("The maximum number is : " +d);
        }
    }
}