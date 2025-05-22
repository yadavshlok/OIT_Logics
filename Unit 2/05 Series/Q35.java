//Compute the odd number sum : 1+3+5+7+⋯+n

import java.util.Scanner;

public class Q35
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 1;i <= n;i++)
        {
            if(i%2 != 0)
            {
                sum += i;
            }
        }
        System.out.println("Sum : "+sum);
    }
}