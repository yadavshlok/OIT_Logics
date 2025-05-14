//Find the maximum of four numbers using nested if-else.

import java.util.Scanner;

public class Q29
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
        
        if (a > b) 
        {
            if (a > c) 
            {
                if (a > d) 
                {
                    System.out.println("The maximum number is: " + a);
                } 
                else 
                {
                    System.out.println("The maximum number is: " + d);
                }
            } 
            else 
            {
                if (c > d) 
                {
                    System.out.println("The maximum number is: " + c);
                } 
                else 
                {
                    System.out.println("The maximum number is: " + d);
                }
            }
        } 
        else 
        {
            if (b > c) 
            {
                if (b > d) 
                {
                    System.out.println("The maximum number is: " + b);
                } 
                else 
                {
                    System.out.println("The maximum number is: " + d);
                }
            } 
            else 
            {
                if (c > d) 
                {
                    System.out.println("The maximum number is: " + c);
                } 
                else 
                {
                    System.out.println("The maximum number is: " + d);
                }
            }
        }
    }
}