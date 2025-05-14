//Accept basic salary and calculate tax based on given tax brackets.

import java.util.Scanner;

public class Q14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary : ");
        double sal = sc.nextInt();

        if(sal < 500000)
        {
            System.out.println("No taxxxx");
        }
        else if(sal > 500000 && sal < 750000)
        {
            double tax = sal*0.1;
            System.out.println("Tax amount is : "+tax);
        }
        else if(sal > 750000 && sal < 100000)
        {
            double tax = sal*0.15;
            System.out.println("Tax amount is : "+tax);
        }
        else if(sal > 1000000 && sal < 1250000)
        {
            double tax = sal*0.2;
            System.out.println("Tax amount is : "+tax);
        }
        else if(sal > 1250000 && sal < 1500000)
        {
            double tax = sal*0.25;
            System.out.println("Tax amount is : "+tax);
        }
        else
        {
            double tax = sal*0.3;
            System.out.println("Tax amount is : "+tax);
        }
    }
}