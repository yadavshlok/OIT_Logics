//Print numbers from 1 to user-specified number n.

import java.util.Scanner;

public class Q02
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int i = 1;
        while(i <= n)
        {
            System.out.print(i+" ");
            i++;
        }        
    }
}