//Find whether a number is even or odd.

import java.util.Scanner;

public class Q01
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        if(num%2 == 0)
        {
            System.out.println(num +" is Even");
        }
        else
        {
            System.out.println(num +" is Odd");
        }
    }
}