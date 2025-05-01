/*Rajesh’s basic salary is input through the keyboard. His D.A. is 40% of basic salary, and H.R.A. is
20% of basic salary. Write a program to calculate his gross sal?*/

import java.util.*;

public class Q40
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary : ");

        Double base = sc.nextDouble();

        Double da = 0.40*base;
        Double hra = 0.20*base;

        Double gross = base+da+hra;

        System.out.println("Gross salary is :"+gross);
    }
}