//Write a method to check if a number is a perfect number

import java.util.Scanner;

public class Q3
{
    public static int perfect(int num)
    {
        int i = 1;
        int sum = 0;
        while(i < num)
        {
            if(num % i == 0)
            {
                sum += i;
            }
            i++;
        }

        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int sum = perfect(num);
        if(num == sum)
        {
            System.out.println(num +" is Perfect number");
        }
        else
        {
            System.out.println(num +" is not Perfect number");
        }
    }
}