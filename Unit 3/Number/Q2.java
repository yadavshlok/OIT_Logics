//Write a method to check if a number is an Armstrong number

import java.util.Scanner;

public class Q2
{
    public static int count(int n)
    {
        int count = 0;
        while (n > 0) 
        {
            count++;
            n /= 10;
        }
        return count;
    }
    
    public static int arm(int num)
    {
        int n = num;
        int arm = 0;
        int count = count(n);
        while (n > 0) {
            int digit = n % 10;
            arm += Math.pow(digit, count);
            n /= 10;
        }

        return arm;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int arm = arm(num);
        if (arm == num) 
        {
            System.out.println("Is Armstrong");
        } 
        else 
        {
            System.out.println("Is NOT Armstrong");
        }
    }
}