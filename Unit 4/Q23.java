//Copy all elements of one array into another array

import java.util.Scanner;

public class Q23
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

        int[] arr2 = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr2[i] = arr[i];
        }

        System.out.print("\n Elements in another array : ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
}