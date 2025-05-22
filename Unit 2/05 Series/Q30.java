//Compute the factorial sum series : 1!+2!+3!+4!+⋯+n!

import java.util.Scanner;

public class Q30
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 1;i <= n;i++)
        {
            int num = i;
            int fact = 1;
            while(num>=1)
            {
                fact *= num;
                num--;
            }
            sum += fact;
        }
        System.out.println("Sum : "+sum);
    }
}