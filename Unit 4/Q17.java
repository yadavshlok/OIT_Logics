//Sort array in descending order.

import java.util.Scanner;
import java.util.Arrays;

public class Q17
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

        System.out.print("\nCurrent array : ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }

        Arrays.sort(arr);

        System.out.print("\nSorted array : ");
        for(int i = n-1; i >= 0; i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}