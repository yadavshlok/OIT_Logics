//Compute the sum of divided factorial series : 1!/1+2!/2+3!/3+⋯+n!/n

import java.util.Scanner;

public class Q31
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
            sum += (fact/i);
        }
        System.out.println("Sum : "+sum);
    }
}