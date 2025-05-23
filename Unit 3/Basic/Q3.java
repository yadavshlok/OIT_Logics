//Implement a method to find the power of a number (a^b).

import java.util.Scanner;

public class Q3
{
    public static int pow(int a,int b)
    {
        int ans = 1;
        for(int i = 0; i < b; i++)
        {
            ans *= a;
        }
        return ans;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();

        System.out.print("Enter b : ");
        int b = sc.nextInt();
        
        int ans = pow(a,b);
        System.out.println(a+" ^ "+b+" = "+ans);
    }
}