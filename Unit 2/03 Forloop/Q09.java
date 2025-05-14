//Compute the sum of consecutive product of digits, e.g., for 1234 → (1×2) + (2×3) + (3×4)

import java.util.Scanner;

public class Q09
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int sum = 0;

        while(num > 0)
        {
            int digit1 = num % 10;
            num /= 10;
            int digit2 = num % 10;
            sum += (digit1*digit2);
        }
        System.out.println("Sum is : "+sum);
    }
}