//Write a program to find the simple interest and compound interest?

import java.util.*;

public class Q21 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of Principle : ");
        Double p=sc.nextDouble();

        System.out.print("Enter the value of Rate : ");
        Double r=sc.nextDouble();

        System.out.print("Enter the value of Time : ");
        Double t=sc.nextDouble();

        Double s=(p*r*t)/100;
        System.out.println("Simple intrest is "+s);

        Double c=(s*Math.pow((1+r/100),t));
        System.out.println("Compund intest is "+c);
    }
}