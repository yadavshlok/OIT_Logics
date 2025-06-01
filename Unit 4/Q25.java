//Left rotate elements of an array.

import java.util.Scanner;

public class Q25
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

        System.out.print("Enter rotate number : ");
        int r = sc.nextInt();

        System.out.print("\nBefore rotation : ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }

        for(int j = 1; j <= r; j++) 
        {
            int first = arr[0];
            for(int i = 0; i < n - 1; i++) 
            {
                arr[i] = arr[i + 1];
            }

            arr[n - 1] = first;
        }

        System.out.print("\nAfter rotation : ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}