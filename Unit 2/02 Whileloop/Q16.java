//Compute the power of a number m^n.

import java.util.Scanner;

public class Q16
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m : ");
        int m = sc.nextInt();

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int ans = 1;
        while(n >= 1)
        {
            ans *= m;
            n--;
        }
        System.out.println("Power is : "+ans);
    }
}