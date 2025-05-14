//Check whether a number is divisible by 17.

import java.util.Scanner;

public class Q02
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");

        int num = sc.nextInt();

        if(num%17 == 0)
        {
            System.out.println(num +" is divisible by 17");
        }
        else
        {
            System.out.println(num +" is not divisible by 17");
        }
    }
}