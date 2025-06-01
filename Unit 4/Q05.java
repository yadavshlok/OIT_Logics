//Accept array from user & print pronic numbers from array.

import java.util.Scanner;

public class Q05
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

        System.out.print("\nPronic numbers : ");
        for(int i = 0; i < n; i++)
        {
            boolean isPronic = false;
            int j = 0;
            while(j < arr[i])
            {
                if(arr[i] == j * (j+1))
                {
                    isPronic = true;
                }
                j++;
            }

            if(isPronic)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}