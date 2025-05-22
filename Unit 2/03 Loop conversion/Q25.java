//Print numbers up to N that do not contain any zero digits.

import java.util.Scanner;

public class Q25
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++)
        {
            int n = i;
            boolean hasZero = false;
            while(n > 0)
            {
                if(n % 10 == 0)
                {
                    hasZero = true;
                    break;
                }
                n /= 10;
            }
            if(!hasZero)
            {
                System.out.println(i);
            }
        }
    }
}