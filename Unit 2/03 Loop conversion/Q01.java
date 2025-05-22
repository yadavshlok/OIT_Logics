//Convert the given while loop multiplication table program into a for loop.

import java.util.Scanner;

public class Q01
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        for(int i = 1;i <= 10;i++)
        {
            System.out.println(n+" x "+i+" : "+(n*i));
        }
    }
}
