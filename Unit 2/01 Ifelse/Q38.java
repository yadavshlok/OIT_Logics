//Accept age, weight, and haemoglobin level and check blood donation eligibility.

import java.util.Scanner;

public class Q38
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age : ");
        int a = sc.nextInt();

        System.out.print("Enter weight (in kg) : ");
        int w = sc.nextInt();

        System.out.print("Enter Haemoglobin level : ");
        int h = sc.nextInt();

        if(a >= 18 && a <= 65 && w >= 50 && h >= 12)
        {
            System.out.println("You are eligible for blood donation");
        }
        else
        {
            System.out.println("You are not eligible for blood donation");
        }
    }
}