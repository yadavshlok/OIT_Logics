// write a program to find the square root given number by using sqrt() function

import java.util.*;

public class Q369
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");

        Double num = sc.nextDouble();

        Double sqrt = Math.sqrt(num);

        System.out.println("Square root is :"+sqrt);
    }
}