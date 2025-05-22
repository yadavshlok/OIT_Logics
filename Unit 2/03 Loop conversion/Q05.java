//Check whether a given number is an Armstrong number.

import java.util.Scanner;

public class Q05 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        int n = num;
        int arm = 0;
        int count = 0;
        while (n > 0) 
        {
            count++;
            n /= 10;
        }

        n = num;
        while (n > 0) {
            int digit = n % 10;
            arm += Math.pow(digit, count);
            n /= 10;
        }

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