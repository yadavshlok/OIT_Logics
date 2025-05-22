//Compute the cube number sum : 1+8+27+64+⋯+n

import java.util.Scanner;

public class Q37
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 1;i <= n;i++)
        {
            sum += i*i*i;
        }
        System.out.println("Sum : "+sum);
    }
}