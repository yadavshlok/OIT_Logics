//Accept a number and display its factors.

import java.util.Scanner;

public class Q18
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        int i = 1;
        while(i <= n)
        {
            if(n%i == 0)
            {
                System.out.println(i);
            }
            i++;
        }
    }
}