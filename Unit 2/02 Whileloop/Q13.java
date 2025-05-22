//Print the multiplication table of a number using the * operator.

import java.util.Scanner;

public class Q13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        int i = 1;
        while(i <= 10)
        {
            System.out.println(n+" x "+i+" : "+(n*i));
            i++;
        }
    }
}