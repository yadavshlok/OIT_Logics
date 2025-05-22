//Accept a number and check if it is a perfect number.

import java.util.Scanner;

public class Q20
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

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

        if(num == sum)
        {
            System.out.println(num +" is Perfect");
        }
        else
        {
            System.out.println(num +" is not Perfect");
        }
    }
}