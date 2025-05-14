//Find the maximum of two numbers.

import java.util.Scanner;

public class Q06
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter first no : ");
        int a = sc.nextInt();

        System.out.print("Enter second no : ");
        int b = sc.nextInt();

        if(a > b)
        {
            System.out.println(a +" is greater");
        }
        else
        {
            System.out.println(b +" is greater");
        }
    }
}