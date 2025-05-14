//Accept monthly sales income and calculate commission.

import java.util.Scanner;

public class Q15
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter monthly sales : ");
        Double amt = sc.nextDouble();

        Double commissionRate = 0.03;

        if(1000000 < amt)
        {
            System.out.println("Your commission is :"+(amt*commissionRate));
        }
        else
        {
            System.out.println("Better luck next time!");
        }
    }
}