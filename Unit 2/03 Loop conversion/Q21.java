//Print all Dicerium numbers up to N.

import java.util.Scanner;

public class Q21
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        for(int i = 1;i <= num;i++)
        {
            int n = i;
            int pow = 0;
            while (n > 0){
                n /= 10;
                pow++;
            }
            n = i;
            int sum = 0;
            while(n > 0)
            {
                int digit = n % 10;
                sum += Math.pow(digit,pow);
                n /= 10;
                pow--; 
            }

            if(sum == i)
            {
                System.out.println("Disarium Number : "+i);
            }
        }
    }
}