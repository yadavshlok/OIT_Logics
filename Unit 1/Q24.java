//write a program to accept basic salary from user and calculate HRA, TA and DA and calculate gross salary

import java.util.*;

public class Q24 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your salary : ");
        Double s=sc.nextDouble();

        Double hraper=20.0;
        Double taper=10.0;
        Double daper=15.0;

        Double hra=(hraper/100)*s;
        Double ta=(taper/100)*s;
        Double da=(daper/100)*s;

        Double gs=hra+ta+da;

        System.out.println("The gross salary is "+gs);

    }
}