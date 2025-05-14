/*Write a program that calculates the movie ticket price based on age (children under 12 get
a discount, seniors over 65 also get a discount).*/

import java.util.Scanner;

public class Q39
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if(age < 12)
        {
            System.out.println("You are eligible for a child discount");
        }
        else if(age > 65)
        {
            System.out.println("You are eligible for a senior citizen discount");
        }
        else
        {
            System.out.println("You are not eligible for any discounts");
        }
    }
}