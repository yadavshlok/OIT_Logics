//Find the maximum of three numbers using the ternary operator.

import java.util.Scanner;

public class Q28
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();

        System.out.print("Enter b : ");
        int b = sc.nextInt();

        System.out.print("Enter c : ");
        int c = sc.nextInt();

        int ans = (a>b)?  (a>c)? a : c   :   (b>c)? b : c;
        System.out.println("the largest num is "+ans);
    }
}