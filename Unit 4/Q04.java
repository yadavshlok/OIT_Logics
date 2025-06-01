//Accept array from user & print perfect numbers from array.

import java.util.Scanner;

public class Q04
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

        System.out.print("\nPerfect numbers : ");
        for(int i = 0; i < n; i++)
        {
            int sum = 0;
            int j = 1;
            while(j < arr[i])
            {
                if(arr[i] % j == 0)
                {
                    sum += j;
                }
                j++;
            }

            if(arr[i] == sum)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}