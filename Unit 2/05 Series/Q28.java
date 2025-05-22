//Compute the sum : 1^X+2^X+3^X+⋯+ n^X

import java.util.Scanner;

public class Q28
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.print("Enter x : ");
        int x = sc.nextInt();

        int sum = 0;
        for(int i = 1;i<=n;i++)
        {
            int val = (int)(Math.pow(i,x));
            sum += val;
        }
        System.out.println("Sum : "+sum);
    }
}