//Print all Armstrong numbers up to N.

import java.util.Scanner;

public class Q18
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        for(int z=1;z<=num;z++)
        {
            int n = z;
            int arm = 0;
            int count = 0;
            while (n > 0) 
            {
                count++;
                n /= 10;
            }

            n = z;
            while (n > 0) 
            {
                int digit = n % 10;
                arm += (int)Math.pow(digit, count);
                n /= 10;
            }

            if(arm == z) 
            {
                System.out.println("Armstrong : "+z);
            } 
        }
    }
}