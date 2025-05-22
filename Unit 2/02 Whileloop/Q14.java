//Print the multiplication table of a number without using the * operator.

import java.util.Scanner;

public class Q14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        int i = 1;
        int sum = 0;
        while(i <= 10)
        {
            sum += n;
            System.out.println(n+" x "+i+" : "+(sum));
            i++;
        }
    }
}