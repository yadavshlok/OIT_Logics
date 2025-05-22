//Print all Magic numbers up to N.

import java.util.Scanner;

public class Q22
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++)
        {
            int n = i;
            int sum = n;

            while(sum > 9)
            {
                int temp = sum;
                sum = 0;
                while(temp > 0)
                {
                    sum += temp % 10;
                    temp /= 10;
                }
            }
            if(sum == 1)
            {
                System.out.println("Magic Number : " + i);
            }
        }
    }
}