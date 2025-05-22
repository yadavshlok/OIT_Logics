/* Accept two numbers n and mmm from the user and print the sum of numbers between n
and m. */

import java.util.Scanner;

public class Q12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.print("Enter m : ");
        int m = sc.nextInt();

        int sum = 0;
        while(n <= m)
        {
            sum += n;
            n++;
        }
        System.out.println("Sum : "+sum);
    }
}