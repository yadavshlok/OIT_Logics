//Find the maximum of two numbers using the ternary operator.

import java.util.Scanner;

public class Q27
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();

        System.out.print("Enter b : ");
        int b = sc.nextInt();
        
        String ans = (a>b)? "a is max" : "b is max";
        System.out.println(ans);
        
    }
}