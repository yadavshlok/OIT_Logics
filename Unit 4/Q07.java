//Accept array from user & print strong numbers from array.

import java.util.Scanner;

public class Q07
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter "+n+" elements : ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("\nStrong numbers : ");
        for(int i = 0; i < n; i++)
        {
            int sum = 0;
            int num = arr[i];
            while(num > 0)
            {
                int digit = num % 10;
                int ifact = 1;
                while(digit > 0)
                {
                    ifact *= digit;
                    digit--;
                }
                sum += ifact;
                num /= 10;
            }

            if(arr[i] == sum)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}