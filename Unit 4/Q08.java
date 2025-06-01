//Accept array from user & print magic numbers from array.

import java.util.Scanner;

public class Q08
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

        System.out.print("\nMagic numbers : ");
        for(int i = 0; i < n; i++)
        {
            int num = arr[i];
            int sum = num;

            while(sum > 9)
            {
                int temp = sum;
                sum = 0;
                while(temp > 0)
                {
                    sum += temp % 10;
                    temp /= 10;
                }
            }

            if(sum == 1)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}