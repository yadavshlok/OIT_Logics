//Check whether a given number is a Disarium Number.

import java.util.Scanner;

public class Q14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int n = num;
        int pow = 0;
        while (num > 0){
            num /= 10;
            pow++;
        }
        num = n;
        int sum = 0;
        while(num > 0)
        {
            int digit = num % 10;
            sum += Math.pow(digit,pow);
            num /= 10;
            pow--; 
        }
        System.out.println(sum);
        if(sum == n)
        {
            System.out.println("Is Disarium Number");
        }
        else
        {
            System.out.println("Is NOT Disarium Number");
        }
    }
}