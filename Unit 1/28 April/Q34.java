// Write a program to find remainder and quotient by accepting divisor and dividend

import java.util.*;

public class Q34
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter divisor :");
        Double divisor = sc.nextDouble();

        System.out.println("Enter dividend :");
        Double dividend = sc.nextDouble();

        double quotient = dividend / divisor;
        double remainder = dividend % divisor;

        System.out.println("Quotient is :"+quotient);
        System.out.println("Remainder is :"+remainder);
    }
}