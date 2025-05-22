//Compute the square number sum : 1+4+9+16+⋯+n

import java.util.Scanner;

public class Q36
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 1;i <= n;i++)
        {
            sum += i*i;
        }
        System.out.println("Sum : "+sum);
    }
}