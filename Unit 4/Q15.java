//Reverse the elements of an array.

import java.util.Scanner;

public class Q15
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

        int s =  0;
        int e = n-1;
        while(s < e)
        {
            int temp = arr[e];
            arr[e] = arr[s];
            arr[s] = temp;
            s++;
            e--;
        }

        System.out.print("\nReversed array : ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}