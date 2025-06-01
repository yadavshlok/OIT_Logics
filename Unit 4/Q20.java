//Find the largest number in an array.

import java.util.Scanner;

public class Q20
{
    public static int largest(int[] arr)
    {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    
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
         
        System.out.print("\nArray : ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }

        int ans = largest(arr);
        System.out.println("\nLargest element : "+ans);
    }
}