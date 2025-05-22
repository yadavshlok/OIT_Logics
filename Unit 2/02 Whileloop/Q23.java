//Accept two numbers and compute their Greatest Common Divisor (GCD) and Least Common Multiple (LCM).

import java.util.Scanner;

public class Q23
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        int gcd = 1;
        int i = 1;
        while(i <= a && i <=b)
        {
            if(a%i == 0 && b%i == 0)
            {
                gcd = i;
            }
            i++;
        }

        System.out.println("GCD : "+gcd);
        
        double lcm = a*b/gcd;
        System.out.println("LCM : "+lcm);
    }
}