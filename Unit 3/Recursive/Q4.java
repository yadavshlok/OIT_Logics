//Find GCD & LCM using recursive method.

import java.util.Scanner;

public class Q4
{
    public static int GCD(int a,int b)
    {
        if(b == 0)
        {
            return a;
        }
        return GCD(b,a%b);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();

        System.out.print("Enter b : ");
        int b = sc.nextInt();

        int gcd = GCD(a,b);

        double lcm = a * b / gcd;
        System.out.println("GCD of a & b : "+gcd);
        System.out.println("LCM of a & b : "+lcm);
    }
}