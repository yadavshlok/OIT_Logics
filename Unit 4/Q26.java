//Right rotate elements of an array.

import java.util.Scanner;

public class Q26
{
    public static void reverseArray(int[] arr, int s,int e)
    {
        while (s < e) 
        {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
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

        System.out.print("Enter rotate number : ");
        int r = sc.nextInt();

        System.out.print("\nBefore rotation : ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        reverseArray(arr,0,arr.length-1);
        reverseArray(arr,0,r-1);
        reverseArray(arr,r,arr.length-1);

        System.out.print("\nAfter rotation : ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}