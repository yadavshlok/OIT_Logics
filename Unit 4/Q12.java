//If array size is even, swap adjacent elements (e.g., [10, 20, 30, 40] → [20, 10, 40, 30]).

import java.util.Scanner;

public class Q12
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

        System.out.print("Before Swapping : ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        
        for(int i = 0; i < n; i+=2)
        {
            arr[i] = arr[i] ^ arr[i+1];
            arr[i+1] = arr[i] ^ arr[i+1];
            arr[i] = arr[i] ^ arr[i+1];
        }

        System.out.print("\nAfter Swapping : ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}