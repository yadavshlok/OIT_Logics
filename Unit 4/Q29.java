//Print elements of an array at even positions.

import java.util.Scanner;

public class Q29
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

        System.out.print("\nElements at even position : ");
        for(int i = 1; i < n; i+=2)
        {
            System.out.print(arr[i]+" ");
        }
    }
}