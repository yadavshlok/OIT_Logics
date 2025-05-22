//Accept n from the user & display all perfect numbers up to n.

import java.util.Scanner;

public class Q26
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for (int num = 1; num <= n; num++) 
        {
            int i = 1;
            int sum = 0;
            while(i < num)
            {
                if(num % i == 0)
                {
                    sum += i;
                }
                i++;
            }

            if(num == sum)
            {
                System.out.println(num);
            }
        }

    }
}