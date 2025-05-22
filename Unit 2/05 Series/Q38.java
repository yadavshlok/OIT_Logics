//Compute the triangular number series : 1+3+6+10+⋯+n

import java.util.Scanner;

public class Q38
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int sum = 0;
        int cnt = 0;
        for(int i = 1; i<= n; i++)
        {

            for(int j = 1; j <= i; j++)
            {
                cnt++;
            }
            System.out.println(cnt+" ");
            sum += cnt;
        }
        System.out.println("Sum : "+sum);
    }
}